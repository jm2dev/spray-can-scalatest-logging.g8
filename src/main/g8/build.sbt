name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$" 

showSuccess  := true

showTiming   := true

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc(),
  "ch.qos.logback" % "logback-classic" % "1.0.9" withSources() withJavadoc(),
  "ch.qos.logback" % "logback-core" % "1.0.9" withSources() withJavadoc(),
  "org.slf4j" % "slf4j-api" % "1.7.2" withSources() withJavadoc(),
  "org.codehaus.groovy" % "groovy" % "2.0.5" withSources() withJavadoc())

initialCommands := "import $organization$.$name;format="lower,word"$._"
