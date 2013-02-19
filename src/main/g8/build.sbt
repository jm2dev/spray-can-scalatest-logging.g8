name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$" 

showSuccess  := true

showTiming   := true

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.9"

libraryDependencies += "ch.qos.logback" % "logback-core" % "1.0.9"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.2"

libraryDependencies += "org.codehaus.groovy" % "groovy" % "2.0.5"

initialCommands := "import $organization$.$name;format="lower,word"$._"
