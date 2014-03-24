name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$" 

showSuccess  := true

showTiming   := true

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "$akkaVersion$"
  val sprayV = "$sprayVersion$"
  Seq(
    "io.spray"            %   "spray-can"     % sprayV withSources() withJavadoc(),
    "io.spray"            %   "spray-routing" % sprayV withSources() withJavadoc(),
    "io.spray"            %   "spray-testkit" % sprayV  % "test" withSources() withJavadoc(),
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV withSources() withJavadoc(),
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test" withSources() withJavadoc(),
    "org.scalatest"       %% "scalatest"      % "$scalatestVersion$" % "test" withSources() withJavadoc(),
    "ch.qos.logback" % "logback-classic" % "$logbackVersion$" withSources() withJavadoc(),
    "ch.qos.logback" % "logback-core" % "$logbackVersion$" withSources() withJavadoc(),
    "org.slf4j" % "slf4j-api" % "$slf4jApiVersion$" withSources() withJavadoc(),
    "org.codehaus.groovy" % "groovy" % "$groovyVersion$" withSources() withJavadoc()
  )
}

packSettings

packMain := Map("$name$" -> "$organization$.$name;format="lower,word"$.Boot")

Revolver.settings

initialCommands := "import $organization$.$name;format="lower,word"$._"
