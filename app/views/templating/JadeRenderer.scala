package views.templating

import org.fusesource.scalate.TemplateEngine
import org.fusesource.scalate.layout.DefaultLayoutStrategy
import org.fusesource.scalate.util.FileResourceLoader
import play.api.Play.current
import play.api._
import play.twirl.api.Html


class JadeRenderer(scalateEngine: TemplateEngine) {

  def render(templateName: String, args: (String, Any)*): Html = {
    val paramMap = args.toMap + (("buildVersion", 0.0), ("includeMinifiedAssets", false))
    println("templateName"+templateName)
    println("paramMap"+paramMap)
    if(Play.isDev) {
      val old = Thread.currentThread().getContextClassLoader
      try{
          Thread.currentThread().setContextClassLoader(Play.application.classloader)
          Html(scalateEngine.layout(templateFile(templateName), paramMap))
        } finally {
          Thread.currentThread().setContextClassLoader(old)
        }
      } else {
        val template: String = templateFile(templateName)
        val layout: String = scalateEngine.layout(template, paramMap)
        Html(layout)
      }

  }

  private def templateFile(name: String): String = {
    s"$name.jade"
  }
}

object JadeRenderer {

  def apply(template: String)= {
    new JadeRenderer(scalateEngine(template))
  }

  private def scalateEngine(withLayoutStrategy: String)= {
    val engine = new TemplateEngine
    engine.resourceLoader = new FileResourceLoader(Some(Play.getFile("app/views")))
    engine.layoutStrategy = new DefaultLayoutStrategy(engine, withLayoutStrategy)
    engine.classpath = "tmp/classes"
    engine.workingDirectory = Play.getFile("tmp")
    engine.combinedClassPath = true
    engine.escapeMarkup = true
    engine.classLoader = Play.classloader
    engine
  }
}
