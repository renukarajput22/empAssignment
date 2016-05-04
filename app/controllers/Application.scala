package controllers

import play.api.mvc.{Action, Controller}
import views.templating.JadeRenderer
import java.net.URI
import com.marklogic.xcc._

object Application extends Controller {
  def index = Action {
    Ok(views.html.main())
  }

  def welcome = Action {
      val jadeRenderer: JadeRenderer = JadeRenderer("/layout/null.jade")
      Ok(jadeRenderer.render("/layout/welcome"))
  }

  def search = Action {
    val jadeRenderer: JadeRenderer = JadeRenderer("/layout/null.jade")
    Ok(jadeRenderer.render("/layout/searchPage"))
  }

  def del = Action {
    val jadeRenderer: JadeRenderer = JadeRenderer("/layout/null.jade")
    Ok(jadeRenderer.render("/layout/deletePage"))
  }

  def up = Action {
    print("in application update")
    val jadeRenderer: JadeRenderer = JadeRenderer("/layout/null.jade")
    Ok(jadeRenderer.render("/layout/updatePage"))
  }
}


