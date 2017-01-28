
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Grocery],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(computerForm: Form[Grocery])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/(""" 

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    """),format.raw/*9.5*/("""<h1>Add an item</h1>
    
    """),_display_(/*11.6*/form(routes.Application.save())/*11.37*/ {_display_(Seq[Any](format.raw/*11.39*/("""
        
        """),format.raw/*13.9*/("""<fieldset>
        
            """),_display_(/*15.14*/inputText(computerForm("name"), '_label -> "Name", '_help -> "")),format.raw/*15.78*/("""
            """),_display_(/*16.14*/inputText(computerForm("quantity"), '_label -> "Quantity", '_help -> "")),format.raw/*16.86*/("""
            """),_display_(/*17.14*/inputText(computerForm("notes"), '_label -> "Notes", '_help -> "")),format.raw/*17.80*/("""
        """),format.raw/*18.9*/("""</fieldset>
        
        <div class="actions">
            <input type="submit" value="Add this!" class="btn primary"> or 
            <a href=""""),_display_(/*22.23*/routes/*22.29*/.Application.list()),format.raw/*22.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))}),format.raw/*25.6*/("""
    
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(computerForm:Form[Grocery],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(computerForm)(messages)

  def f:((Form[Grocery]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (computerForm) => (messages) => apply(computerForm)(messages)

  def ref: this.type = this

}


}

/**/
object createForm extends createForm_Scope0.createForm
              /*
                  -- GENERATED --
                  DATE: Sat Jan 28 15:48:33 EST 2017
                  SOURCE: /Users/ryanmccormack/computer-database-scala/app/views/createForm.scala.html
                  HASH: a5915a42c1cc3b1167073c358921eac3dd57933e
                  MATRIX: 553->1|713->80|745->104|824->59|852->78|880->153|909->157|920->161|958->163|994->173|1051->204|1091->235|1131->237|1176->255|1236->288|1321->352|1362->366|1455->438|1496->452|1583->518|1619->527|1795->676|1810->682|1850->701|1935->756|1972->763
                  LINES: 20->1|24->5|24->5|25->1|27->4|28->5|30->7|30->7|30->7|32->9|34->11|34->11|34->11|36->13|38->15|38->15|39->16|39->16|40->17|40->17|41->18|45->22|45->22|45->22|48->25|50->27
                  -- GENERATED --
              */
          