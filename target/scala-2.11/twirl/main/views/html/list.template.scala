
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Page[Grocery],Int,String,play.api.mvc.Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: Page[Grocery], currentOrderBy: Int, currentFilter: String)(implicit flash: play.api.mvc.Flash, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*16.2*/header/*16.8*/(orderBy: Int, title: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.41*/("""
    """),format.raw/*17.5*/("""<meta name="viewport" content="width=device-width, initial-scale=1">
    <th class="col"""),_display_(/*18.20*/orderBy),format.raw/*18.27*/(""" """),format.raw/*18.28*/("""header """),_display_(/*18.36*/if(scala.math.abs(currentOrderBy) == orderBy){/*18.83*/{if(currentOrderBy < 0) "headerSortDown" else "headerSortUp"}}),format.raw/*18.144*/("""">
        <a href=""""),_display_(/*19.19*/link(0, Some(orderBy))),format.raw/*19.41*/("""">"""),_display_(/*19.44*/title),format.raw/*19.49*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
    routes.Application.list(newPage, newOrderBy.map { orderBy =>
        if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
    }.getOrElse(currentOrderBy), currentFilter)
    
}};
Seq[Any](format.raw/*1.130*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*11.2*/("""

"""),format.raw/*15.37*/("""
"""),format.raw/*21.2*/("""

"""),_display_(/*23.2*/main/*23.6*/ {_display_(Seq[Any](format.raw/*23.8*/("""
    
    """),format.raw/*25.5*/("""<h1>"""),_display_(/*25.10*/Messages("Groceries!", currentPage.total)),format.raw/*25.51*/("""</h1>

    """),_display_(/*27.6*/flash/*27.11*/.get("success").map/*27.30*/ { message =>_display_(Seq[Any](format.raw/*27.43*/("""
        """),format.raw/*28.9*/("""<div class="alert-message warning">
            <strong>Done!</strong> """),_display_(/*29.37*/message),format.raw/*29.44*/("""
        """),format.raw/*30.9*/("""</div>
    """)))}),format.raw/*31.6*/("""

    """),format.raw/*33.5*/("""<div>
     <a class="btn success" id="add" href=""""),_display_(/*34.45*/routes/*34.51*/.Application.create()),format.raw/*34.72*/("""">Add a new grocery</a>
    </div>
    <div>
    """),_display_(/*37.6*/Option(currentPage.items)/*37.31*/.filterNot(_.isEmpty).map/*37.56*/ { groceries =>_display_(Seq[Any](format.raw/*37.71*/("""
        
        """),format.raw/*39.9*/("""<table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(/*42.22*/header(2, "Name")),format.raw/*42.39*/("""
                    """),_display_(/*43.22*/header(3, "Quantity")),format.raw/*43.43*/("""
                    """),_display_(/*44.22*/header(4, "Notes")),format.raw/*44.40*/("""
                """),format.raw/*45.17*/("""</tr>
            </thead>
            <tbody>

                """),_display_(/*49.18*/groceries/*49.27*/.map/*49.31*/ {/*50.21*/case grocery =>/*50.36*/ {_display_(Seq[Any](format.raw/*50.38*/("""
                        """),format.raw/*51.25*/("""<tr>
                            <td><a href=""""),_display_(/*52.43*/routes/*52.49*/.Application.edit(grocery.id.get)),format.raw/*52.82*/("""">"""),_display_(/*52.85*/grocery/*52.92*/.name),format.raw/*52.97*/("""</a></td>
                            <td>
                                """),_display_(/*54.34*/grocery/*54.41*/.quantity.getOrElse/*54.60*/ {_display_(Seq[Any](format.raw/*54.62*/(""" """),format.raw/*54.63*/("""<em>-</em> """)))}),format.raw/*54.75*/("""
                            """),format.raw/*55.29*/("""</td>
                            <td>
                                """),_display_(/*57.34*/grocery/*57.41*/.notes.getOrElse/*57.57*/ {_display_(Seq[Any](format.raw/*57.59*/(""" """),format.raw/*57.60*/("""<em>-</em> """)))}),format.raw/*57.72*/("""
                            """),format.raw/*58.29*/("""</td>
                        </tr>
                    """)))}}),format.raw/*61.18*/("""

            """),format.raw/*63.13*/("""</tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(/*68.18*/currentPage/*68.29*/.prev.map/*68.38*/ { page =>_display_(Seq[Any](format.raw/*68.48*/("""
                    """),format.raw/*69.21*/("""<li class="prev">
                        <a href=""""),_display_(/*70.35*/link(page)),format.raw/*70.45*/("""">&larr; Previous</a>
                    </li> 
                """)))}/*72.18*/.getOrElse/*72.28*/ {_display_(Seq[Any](format.raw/*72.30*/("""
                    """),format.raw/*73.21*/("""<li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))}),format.raw/*76.18*/("""
                """),format.raw/*77.17*/("""<li class="current">
                    <a>Page """),_display_(/*78.30*/(currentPage.offset + 1)),format.raw/*78.54*/(""" """),format.raw/*78.55*/("""to """),_display_(/*78.59*/(currentPage.offset + groceries.size)),format.raw/*78.96*/(""" """),format.raw/*78.97*/("""of """),_display_(/*78.101*/currentPage/*78.112*/.total),format.raw/*78.118*/("""</a>
                </li>
                """),_display_(/*80.18*/currentPage/*80.29*/.next.map/*80.38*/ { page =>_display_(Seq[Any](format.raw/*80.48*/("""
                    """),format.raw/*81.21*/("""<li class="next">
                        <a href=""""),_display_(/*82.35*/link(page)),format.raw/*82.45*/("""">Next &rarr;</a>
                    </li> 
                """)))}/*84.18*/.getOrElse/*84.28*/ {_display_(Seq[Any](format.raw/*84.30*/("""
                    """),format.raw/*85.21*/("""<li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))}),format.raw/*88.18*/("""
            """),format.raw/*89.13*/("""</ul>
        </div>
        
    """)))}/*92.6*/.getOrElse/*92.16*/ {_display_(Seq[Any](format.raw/*92.18*/("""
        
        """),format.raw/*94.9*/("""<div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}),format.raw/*98.6*/("""
"""),format.raw/*99.1*/("""</div>
        
""")))}),format.raw/*101.2*/("""

            """))
      }
    }
  }

  def render(currentPage:Page[Grocery],currentOrderBy:Int,currentFilter:String,flash:play.api.mvc.Flash,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentOrderBy,currentFilter)(flash,messages)

  def f:((Page[Grocery],Int,String) => (play.api.mvc.Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentOrderBy,currentFilter) => (flash,messages) => apply(currentPage,currentOrderBy,currentFilter)(flash,messages)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Sat Jan 28 22:34:16 UTC 2017
                  SOURCE: /home/ryan/groshare/app/views/list.scala.html
                  HASH: 7d6a0ef9e7999cc631354d10e3b0c16cece98364
                  MATRIX: 571->1|778->628|792->634|902->667|934->672|1049->760|1077->767|1106->768|1141->776|1196->823|1280->884|1328->905|1371->927|1401->930|1427->935|1465->258|1476->262|1761->129|1790->256|1818->516|1848->626|1876->951|1905->954|1917->958|1956->960|1993->970|2025->975|2087->1016|2125->1028|2139->1033|2167->1052|2218->1065|2254->1074|2353->1146|2381->1153|2417->1162|2459->1174|2492->1180|2569->1230|2584->1236|2626->1257|2702->1307|2736->1332|2770->1357|2823->1372|2868->1390|2997->1492|3035->1509|3084->1531|3126->1552|3175->1574|3214->1592|3259->1609|3351->1674|3369->1683|3382->1687|3393->1711|3417->1726|3457->1728|3510->1753|3584->1800|3599->1806|3653->1839|3683->1842|3699->1849|3725->1854|3828->1930|3844->1937|3872->1956|3912->1958|3941->1959|3984->1971|4041->2000|4140->2072|4156->2079|4181->2095|4221->2097|4250->2098|4293->2110|4350->2139|4439->2214|4481->2228|4618->2338|4638->2349|4656->2358|4704->2368|4753->2389|4832->2441|4863->2451|4948->2517|4967->2527|5007->2529|5056->2550|5204->2667|5249->2684|5326->2734|5371->2758|5400->2759|5431->2763|5489->2800|5518->2801|5550->2805|5571->2816|5599->2822|5670->2866|5690->2877|5708->2886|5756->2896|5805->2917|5884->2969|5915->2979|5996->3041|6015->3051|6055->3053|6104->3074|6248->3187|6289->3200|6342->3235|6361->3245|6401->3247|6446->3265|6564->3353|6592->3354|6640->3371
                  LINES: 20->1|24->16|24->16|26->16|27->17|28->18|28->18|28->18|28->18|28->18|28->18|29->19|29->19|29->19|29->19|31->6|31->6|37->1|39->5|40->11|42->15|43->21|45->23|45->23|45->23|47->25|47->25|47->25|49->27|49->27|49->27|49->27|50->28|51->29|51->29|52->30|53->31|55->33|56->34|56->34|56->34|59->37|59->37|59->37|59->37|61->39|64->42|64->42|65->43|65->43|66->44|66->44|67->45|71->49|71->49|71->49|71->50|71->50|71->50|72->51|73->52|73->52|73->52|73->52|73->52|73->52|75->54|75->54|75->54|75->54|75->54|75->54|76->55|78->57|78->57|78->57|78->57|78->57|78->57|79->58|81->61|83->63|88->68|88->68|88->68|88->68|89->69|90->70|90->70|92->72|92->72|92->72|93->73|96->76|97->77|98->78|98->78|98->78|98->78|98->78|98->78|98->78|98->78|98->78|100->80|100->80|100->80|100->80|101->81|102->82|102->82|104->84|104->84|104->84|105->85|108->88|109->89|112->92|112->92|112->92|114->94|118->98|119->99|121->101
                  -- GENERATED --
              */
          