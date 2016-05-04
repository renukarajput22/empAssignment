// @SOURCE:/Users/rrn3194/empWorkspace/conf/routes
// @HASH:7ade815c9e381657d0296c1400d2a80cd4a4ab98
// @DATE:Wed May 04 14:17:17 IST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:16
class ReverseAssets {


// @LINE:16
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:12
class ReverseDeleteController {


// @LINE:12
def delete(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deleteResult")
}
                        

}
                          

// @LINE:8
class ReverseAddController {


// @LINE:8
def input(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "done")
}
                        

}
                          

// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:13
def up(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "updatePage")
}
                        

// @LINE:7
def welcome(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "welcome")
}
                        

// @LINE:11
def del(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deletePage")
}
                        

// @LINE:9
def search(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "searchPage")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:10
class ReverseSearchController {


// @LINE:10
def find(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "searchResult")
}
                        

}
                          

// @LINE:14
class ReverseUpdateController {


// @LINE:14
def update(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "updateResult")
}
                        

}
                          
}
                  


// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:16
class ReverseAssets {


// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:12
class ReverseDeleteController {


// @LINE:12
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeleteController.delete",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteResult"})
      }
   """
)
                        

}
              

// @LINE:8
class ReverseAddController {


// @LINE:8
def input : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AddController.input",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "done"})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:13
def up : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.up",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatePage"})
      }
   """
)
                        

// @LINE:7
def welcome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.welcome",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "welcome"})
      }
   """
)
                        

// @LINE:11
def del : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.del",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletePage"})
      }
   """
)
                        

// @LINE:9
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchPage"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:10
class ReverseSearchController {


// @LINE:10
def find : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.find",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchResult"})
      }
   """
)
                        

}
              

// @LINE:14
class ReverseUpdateController {


// @LINE:14
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UpdateController.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateResult"})
      }
   """
)
                        

}
              
}
        


// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:16
class ReverseAssets {


// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:12
class ReverseDeleteController {


// @LINE:12
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeleteController.delete(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DeleteController", "delete", Seq(), "POST", """""", _prefix + """deleteResult""")
)
                      

}
                          

// @LINE:8
class ReverseAddController {


// @LINE:8
def input(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AddController.input(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AddController", "input", Seq(), "POST", """""", _prefix + """done""")
)
                      

}
                          

// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:13
def up(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.up(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "up", Seq(), "POST", """""", _prefix + """updatePage""")
)
                      

// @LINE:7
def welcome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.welcome(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "welcome", Seq(), "POST", """""", _prefix + """welcome""")
)
                      

// @LINE:11
def del(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.del(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "del", Seq(), "POST", """""", _prefix + """deletePage""")
)
                      

// @LINE:9
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "search", Seq(), "POST", """""", _prefix + """searchPage""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:10
class ReverseSearchController {


// @LINE:10
def find(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.find(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SearchController", "find", Seq(), "POST", """""", _prefix + """searchResult""")
)
                      

}
                          

// @LINE:14
class ReverseUpdateController {


// @LINE:14
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UpdateController.update(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UpdateController", "update", Seq(), "POST", """""", _prefix + """updateResult""")
)
                      

}
                          
}
        
    