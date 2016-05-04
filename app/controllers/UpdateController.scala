package controllers

import play.api.mvc.{Action, AnyContent, Request, Controller}
import views.templating.JadeRenderer

/**
  * Created by rrn3194 on 5/4/16.
  */
class UpdateController(renderer: JadeRenderer) extends Controller{
println("in update controller ====>>>>>> ")
  def update() = Action {
    (request: Request[AnyContent]) => {
      println("i m in  ====>>>>>> ")
      Ok("Update")
    }
  }
}

object UpdateController extends UpdateController(JadeRenderer("/layout/null.jade"))