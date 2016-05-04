// @SOURCE:/Users/rrn3194/empWorkspace/conf/routes
// @HASH:7ade815c9e381657d0296c1400d2a80cd4a4ab98
// @DATE:Wed May 04 14:17:17 IST 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_welcome1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("welcome"))))
private[this] lazy val controllers_Application_welcome1_invoker = createInvoker(
controllers.Application.welcome,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "welcome", Nil,"POST", """""", Routes.prefix + """welcome"""))
        

// @LINE:8
private[this] lazy val controllers_AddController_input2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("done"))))
private[this] lazy val controllers_AddController_input2_invoker = createInvoker(
controllers.AddController.input,
HandlerDef(this.getClass.getClassLoader, "", "controllers.AddController", "input", Nil,"POST", """""", Routes.prefix + """done"""))
        

// @LINE:9
private[this] lazy val controllers_Application_search3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchPage"))))
private[this] lazy val controllers_Application_search3_invoker = createInvoker(
controllers.Application.search,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Nil,"POST", """""", Routes.prefix + """searchPage"""))
        

// @LINE:10
private[this] lazy val controllers_SearchController_find4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchResult"))))
private[this] lazy val controllers_SearchController_find4_invoker = createInvoker(
controllers.SearchController.find,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SearchController", "find", Nil,"POST", """""", Routes.prefix + """searchResult"""))
        

// @LINE:11
private[this] lazy val controllers_Application_del5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletePage"))))
private[this] lazy val controllers_Application_del5_invoker = createInvoker(
controllers.Application.del,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "del", Nil,"POST", """""", Routes.prefix + """deletePage"""))
        

// @LINE:12
private[this] lazy val controllers_DeleteController_delete6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteResult"))))
private[this] lazy val controllers_DeleteController_delete6_invoker = createInvoker(
controllers.DeleteController.delete,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DeleteController", "delete", Nil,"POST", """""", Routes.prefix + """deleteResult"""))
        

// @LINE:13
private[this] lazy val controllers_Application_up7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updatePage"))))
private[this] lazy val controllers_Application_up7_invoker = createInvoker(
controllers.Application.up,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "up", Nil,"POST", """""", Routes.prefix + """updatePage"""))
        

// @LINE:14
private[this] lazy val controllers_UpdateController_update8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateResult"))))
private[this] lazy val controllers_UpdateController_update8_invoker = createInvoker(
controllers.UpdateController.update,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UpdateController", "update", Nil,"POST", """""", Routes.prefix + """updateResult"""))
        

// @LINE:16
private[this] lazy val controllers_Assets_at9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """welcome""","""controllers.Application.welcome"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """done""","""controllers.AddController.input"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchPage""","""controllers.Application.search"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchResult""","""controllers.SearchController.find"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletePage""","""controllers.Application.del"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteResult""","""controllers.DeleteController.delete"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updatePage""","""controllers.Application.up"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateResult""","""controllers.UpdateController.update"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:7
case controllers_Application_welcome1_route(params) => {
   call { 
        controllers_Application_welcome1_invoker.call(controllers.Application.welcome)
   }
}
        

// @LINE:8
case controllers_AddController_input2_route(params) => {
   call { 
        controllers_AddController_input2_invoker.call(controllers.AddController.input)
   }
}
        

// @LINE:9
case controllers_Application_search3_route(params) => {
   call { 
        controllers_Application_search3_invoker.call(controllers.Application.search)
   }
}
        

// @LINE:10
case controllers_SearchController_find4_route(params) => {
   call { 
        controllers_SearchController_find4_invoker.call(controllers.SearchController.find)
   }
}
        

// @LINE:11
case controllers_Application_del5_route(params) => {
   call { 
        controllers_Application_del5_invoker.call(controllers.Application.del)
   }
}
        

// @LINE:12
case controllers_DeleteController_delete6_route(params) => {
   call { 
        controllers_DeleteController_delete6_invoker.call(controllers.DeleteController.delete)
   }
}
        

// @LINE:13
case controllers_Application_up7_route(params) => {
   call { 
        controllers_Application_up7_invoker.call(controllers.Application.up)
   }
}
        

// @LINE:14
case controllers_UpdateController_update8_route(params) => {
   call { 
        controllers_UpdateController_update8_invoker.call(controllers.UpdateController.update)
   }
}
        

// @LINE:16
case controllers_Assets_at9_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     