package controllers

import play.api.libs.json.Json
import play.api.mvc.{AnyContent, Request, Action, Controller}
import service.{SearchService}
import views.templating.JadeRenderer

/**
  * Created by rrn3194 on 4/27/16.
  */
class SearchController(renderer: JadeRenderer) extends Controller {

  def find() = Action {
    (request: Request[AnyContent]) => {
//        val ddVal = request.body.asFormUrlEncoded.get("dropdown")
//        val ttField = request.body.asFormUrlEncoded.get("input")
        val jsonData = request.body.asJson.get
        val khoj = new SearchService(jsonData)
        val searchRes: String = khoj.search
      println(">>>>>>>>> "+searchRes)
//    Ok(renderer.render("/layout/searchResult", "searchResult" -> searchResult))
      if (searchRes.isEmpty)
        Ok(Json.toJson("No such record found"))
      else
        Ok(Json.toJson(searchRes))
    }
  }
}

object SearchController extends SearchController(JadeRenderer("/layout/null.jade"))