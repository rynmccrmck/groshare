package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import play.api.Play.current
import play.api.i18n.Messages.Implicits._

import anorm._

import views._
import models._

class Application extends Controller { 
  
  val Home = Redirect(routes.Application.list(0, 2, ""))
  
  val groceryForm = Form(
    mapping(
      "id" -> ignored(None:Option[Long]),
      "name" -> nonEmptyText,
      "quantity" -> optional(number),
      "notes" -> optional(text),
      "purchased" -> boolean
    )(Grocery.apply)(Grocery.unapply)
  )
  
  // -- Actions

  def index = Action { Home }
  
  def list(page: Int, orderBy: Int, filter: String) = Action { implicit request =>
    Ok(html.list(
      Grocery.list(page = page, orderBy = orderBy, filter = ("%"+filter+"%")),
      orderBy, filter
    ))
  }
  
  def edit(id: Long) = Action {
    Grocery.findById(id).map { grocery =>
      Ok(html.editForm(id, groceryForm.fill(grocery)))
    }.getOrElse(NotFound)
  }
  
  def update(id: Long) = Action { implicit request =>
    groceryForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.editForm(id, formWithErrors)),
      grocery => {
        Grocery.update(id, grocery)
        Home.flashing("success" -> "Grocery %s has been updated".format(grocery.name))
      }
    )
  }
  
  def create = Action {
    Ok(html.createForm(groceryForm))
  }
  
  def save = Action { implicit request =>
    groceryForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.createForm(formWithErrors)),
      grocery => {
        Grocery.insert(grocery)
        Home.flashing("success" -> "Grocery %s has been created".format(grocery.name))
      }
    )
  }
  
  def delete(id: Long) = Action {
    Grocery.delete(id)
    Home.flashing("success" -> "Grocery has been deleted")
  }

}
            
