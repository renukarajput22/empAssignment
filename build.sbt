name := "just-play-scala"

version := "1.0-SNAPSHOT"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

libraryDependencies++=Seq("com.marklogic" % "marklogic-xcc" % "6.0.3",
"org.scalatra.scalate" % "scalate-core_2.10" % "1.7.0")

