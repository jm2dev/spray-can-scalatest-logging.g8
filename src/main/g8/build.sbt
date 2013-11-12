name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$" 

showSuccess  := true

showTiming   := true

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "scalatestVersion" % "test" withSources() withJavadoc(),
  "ch.qos.logback" % "logback-classic" % "$logbackVersion$" withSources() withJavadoc(),
  "ch.qos.logback" % "logback-core" % "$logbackVersion$" withSources() withJavadoc(),
  "org.slf4j" % "slf4j-api" % "$slf4jApiVersion$" withSources() withJavadoc(),
  "org.codehaus.groovy" % "groovy" % "$groovyVersion$" withSources() withJavadoc())

initialCommands := "import $organization$.$name;format="lower,word"$._"
