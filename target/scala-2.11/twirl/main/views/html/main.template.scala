
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Grocery List</title>
        
        """),format.raw/*14.47*/("""
        """),format.raw/*15.9*/("""<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*15.70*/routes/*15.76*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*15.119*/("""">
        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.at("stylesheets/main.css")),format.raw/*17.94*/(""""/> 
        
        
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(/*25.27*/routes/*25.33*/.Application.index()),format.raw/*25.53*/("""">
                    Our Groceries
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(/*32.14*/content),format.raw/*32.21*/("""
        """),format.raw/*33.9*/("""</section>
        
    </body>
</html>
"""))
      }
    }
  }

  def render(content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(content)(messages)

  def f:((Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (content) => (messages) => apply(content)(messages)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Jan 28 15:40:05 EST 2017
                  SOURCE: /Users/ryanmccormack/computer-database-scala/app/views/main.scala.html
                  HASH: d8e21864dc8778c5c8121b61781a626f0dbecab3
                  MATRIX: 532->1|671->45|699->47|814->633|850->642|938->703|953->709|1018->752|1110->817|1125->823|1180->857|1350->1000|1365->1006|1406->1026|1577->1170|1605->1177|1641->1186
                  LINES: 20->1|25->1|27->3|32->14|33->15|33->15|33->15|33->15|35->17|35->17|35->17|43->25|43->25|43->25|50->32|50->32|51->33
                  -- GENERATED --
              */
          