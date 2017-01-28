
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object twitterBootstrapInput_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class twitterBootstrapInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.52*/("""
"""),format.raw/*6.1*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
<div class="clearfix """),_display_(/*7.23*/if(elements.hasErrors)/*7.45*/ {_display_(Seq[Any](format.raw/*7.47*/("""error""")))}),format.raw/*7.53*/("""">
    <label for=""""),_display_(/*8.18*/elements/*8.26*/.id),format.raw/*8.29*/("""">"""),_display_(/*8.32*/elements/*8.40*/.label),format.raw/*8.46*/("""</label>
    <div class="input">
        """),_display_(/*10.10*/elements/*10.18*/.input),format.raw/*10.24*/("""
        """),format.raw/*11.9*/("""<span class="help-inline">"""),_display_(/*11.36*/elements/*11.44*/.infos.mkString(", ")),format.raw/*11.65*/("""</span> 
    </div>
</div>
"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


}

/**/
object twitterBootstrapInput extends twitterBootstrapInput_Scope0.twitterBootstrapInput
              /*
                  -- GENERATED --
                  DATE: Sat Jan 28 15:54:28 EST 2017
                  SOURCE: /Users/ryanmccormack/computer-database-scala/app/views/twitterBootstrapInput.scala.html
                  HASH: c068e09267122012e4dfcf5cc36584def242e81e
                  MATRIX: 573->1|700->33|729->190|756->191|873->282|903->304|942->306|978->312|1024->332|1040->340|1063->343|1092->346|1108->354|1134->360|1203->402|1220->410|1247->416|1283->425|1337->452|1354->460|1396->481
                  LINES: 20->1|25->1|27->5|28->6|29->7|29->7|29->7|29->7|30->8|30->8|30->8|30->8|30->8|30->8|32->10|32->10|32->10|33->11|33->11|33->11|33->11
                  -- GENERATED --
              */
          