
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Form[Grocery],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, computerForm: Form[Grocery])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*1.70*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/("""

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    """),format.raw/*9.5*/("""<h1>Edit item</h1>
    
    """),_display_(/*11.6*/form(routes.Application.update(id))/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
        
        """),format.raw/*13.9*/("""<fieldset>
        
            """),_display_(/*15.14*/inputText(computerForm("name"), '_label -> "Name", '_help -> "")),format.raw/*15.78*/("""
            """),_display_(/*16.14*/inputDate(computerForm("quantity"), '_label -> "Quantity", '_help -> "")),format.raw/*16.86*/("""
            """),_display_(/*17.14*/inputDate(computerForm("notes"), '_label -> "Notes", '_help -> "")),format.raw/*17.80*/("""
        """),format.raw/*18.9*/("""</fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this item" class="btn primary"> or 
            <a href=""""),_display_(/*22.23*/routes/*22.29*/.Application.list()),format.raw/*22.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))}),format.raw/*25.6*/("""
    
    """),_display_(/*27.6*/form(routes.Application.delete(id), 'class -> "topRight")/*27.63*/ {_display_(Seq[Any](format.raw/*27.65*/("""
        """),format.raw/*28.9*/("""<input type="submit" value="Delete this item" class="btn danger">
    """)))}),format.raw/*29.6*/("""
    
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(id:Long,computerForm:Form[Grocery],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(id,computerForm)(messages)

  def f:((Long,Form[Grocery]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (id,computerForm) => (messages) => apply(id,computerForm)(messages)

  def ref: this.type = this

}


}

/**/
object editForm extends editForm_Scope0.editForm
              /*
                  -- GENERATED --
                  DATE: Sat Jan 28 22:34:16 UTC 2017
                  SOURCE: /home/ryan/groshare/app/views/editForm.scala.html
                  HASH: 60a287d56a8e01478477b147d9ff2f82dd223033
                  MATRIX: 554->1|724->90|756->114|835->69|863->88|891->163|919->166|930->170|968->172|1004->182|1059->211|1103->246|1143->248|1188->266|1248->299|1333->363|1374->377|1467->449|1508->463|1595->529|1631->538|1812->692|1827->698|1867->717|1952->772|1989->783|2055->840|2095->842|2131->851|2232->922|2269->929
                  LINES: 20->1|24->5|24->5|25->1|27->4|28->5|30->7|30->7|30->7|32->9|34->11|34->11|34->11|36->13|38->15|38->15|39->16|39->16|40->17|40->17|41->18|45->22|45->22|45->22|48->25|50->27|50->27|50->27|51->28|52->29|54->31
                  -- GENERATED --
              */
          