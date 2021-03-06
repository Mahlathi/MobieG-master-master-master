name := """mobig"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)


libraryDependencies += "com.google.code.gson" % "gson" % "2.2.4"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.1.7"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.32"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "io.spray" % "spray-can" % "1.1-M8",
  "io.spray" % "spray-http" % "1.1-M8",
  "io.spray" % "spray-routing" % "1.1-M8",
  "com.typesafe.akka" %% "akka-actor" % "2.1.4",
  "com.typesafe.akka" %% "akka-slf4j" % "2.1.4",
  "net.liftweb" %% "lift-json" % "2.5.1",
  "ch.qos.logback" % "logback-classic" % "1.0.13"
)

resolvers ++= Seq(
  "Spray repository" at "http://repo.spray.io",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

