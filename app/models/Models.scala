package models

import java.util.{Date}

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._
import scala.language.postfixOps

case class Grocery(id: Option[Long] = None, name: String, quantity: Option[Int], notes: Option[String], purchased:Boolean)


/**
 * Helper for pagination.
 */
case class Page[A](items: Seq[A], page: Int, offset: Long, total: Long) {
  lazy val prev = Option(page - 1).filter(_ >= 0)
  lazy val next = Option(page + 1).filter(_ => (offset + items.size) < total)
}

object Grocery {
  
  val simple = {
    get[Option[Long]]("id") ~
    get[String]("name") ~
    get[Option[Int]]("quantity") ~
    get[Option[String]]("notes") ~
    get[Boolean]("purchased") map {
      case id~name~quantity~notes~purchased => Grocery(id, name, quantity, notes, purchased)
    }
  }


  def findById(id: Long): Option[Grocery] = {
    DB.withConnection { implicit connection =>
      SQL("select * from groceries where id = {id}").on('id -> id).as(Grocery.simple.singleOpt)
    }
  }
  
  def list(page: Int = 0, pageSize: Int = 10, orderBy: Int = 1, filter: String = "%"): Page[Grocery] = {
    
    val offest = pageSize * page
    
    DB.withConnection { implicit connection =>
      
      val groceries = SQL(
        """
          select * from groceries 
          where name like {filter}
          order by {orderBy} nulls last
          limit {pageSize} offset {offset}
        """
      ).on(
        'pageSize -> pageSize, 
        'offset -> offest,
        'filter -> filter,
        'orderBy -> orderBy
      ).apply.toList.map(row => Grocery(
                row[Option[Long]]("id"),
                row[String]("name"),
                row[Option[Int]]("quantity"),
                row[Option[String]]("notes"),
                row[Boolean]("Purchased")))


      val totalRows = SQL(
        """
          select count(*) from groceries 
          where name like {filter}
        """
      ).on(
        'filter -> filter
      ).as(scalar[Long].single)

      Page(groceries, page, offest, totalRows)
      
    }
    
  }
  
  def update(id: Long, grocery: Grocery) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          update groceries
          set name = {name}, quantity = {quantity}, notes = {notes}, purchased = {purchased}
          where id = {id}
        """
      ).on(
        'id -> id,
        'name -> grocery.name,
        'quantity -> grocery.quantity,
        'notes -> grocery.notes,
        'purchased -> grocery.purchased
      ).executeUpdate()
    }
  }
  
  def insert(grocery: Grocery) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into groceries values (
            (select next value for groceries_seq), 
            {name}, {quantity}, {notes}, {purchased}
          )
        """
      ).on(
        'name -> grocery.name,
        'quantity -> grocery.quantity,
        'notes -> grocery.notes,
        'purchased -> grocery.purchased
      ).executeUpdate()
    }
  }
  
  def delete(id: Long) = {
    DB.withConnection { implicit connection =>
      SQL("delete from groceries where id = {id}").on('id -> id).executeUpdate()
    }
  }
  
}

