package controllers

import play.api.mvc._
import service.CreateService
import views.templating.JadeRenderer

/**
  * Created by rrn3194 on 4/26/16.
  * **/

class AddController(renderer: JadeRenderer) extends Controller {

  def input() = Action{
    (request: Request[AnyContent]) => {
//      val eID: Seq[String] = request.body.asFormUrlEncoded.get("id")
//      val eName: Seq[String] = request.body.asFormUrlEncoded.get("name")
//      val eSalary: Seq[String] = request.body.asFormUrlEncoded.get("salary")
      val jsonData = request.body.asJson.get
      val add = new CreateService
      add.input(jsonData)
      Ok(jsonData)
    }
  }
}

object AddController extends AddController(JadeRenderer("/layout/null.jade"))