
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>Just Play Scala</title>
    </head>
    <body>
    <form action="welcome" method="post">
        <h1>Employee Information Database</h1>
        <p>Pick any action</p></br>
        <input type="submit" name="Add" value='Add'><br>
    </form>
    <form action = "searchPage" method= "post">
        <input type="submit" name="Search" value="Search" style='margin-top:20px'><br>
    </form>
    <form action = "deletePage" method= "post">
        <input type="submit" name="Delete" value="Delete" style='margin-top:20px'><br>
    </form>
    <form method= "post">
        <input type="submit" name="Update" value="Update" style='margin-top:20px'><br>
    </form>
    </body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon May 02 11:51:03 IST 2016
                  SOURCE: /Users/rrn3194/empWorkspace/app/views/main.scala.html
                  HASH: 23c1aff4a2a11c6bb3feaea47aafafbbfd8d34e3
                  MATRIX: 579->0
                  LINES: 22->1
                  -- GENERATED --
              */
          