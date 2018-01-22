name := "akka-logger-example"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor" % "2.5.9",
	"ch.qos.logback" % "logback-classic" % "1.2.3",
	"com.typesafe.akka" %% "akka-slf4j" % "2.5.9")