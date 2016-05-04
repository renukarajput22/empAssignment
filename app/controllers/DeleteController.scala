package controllers

import play.api.mvc._
import service.{DeleteService}
import views.templating.JadeRenderer

/**
  * Created by rrn3194 on 4/27/16.
  */
class DeleteController(renderer : JadeRenderer) extends Controller {

  def delete() = Action {
    (request: Request[AnyContent]) => {
        val jsonData = request.body.asJson.get
        val delete = new DeleteService(jsonData)
        delete.remove
        Ok("Nothing")
      }
   }
}

object DeleteController extends DeleteController(JadeRenderer("/layout/null.jade"))