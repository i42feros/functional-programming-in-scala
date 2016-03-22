name := "functional-programming-in-scala"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.7"

//mainClass in (Compile, run) := Some("functional.programming.Main")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.3" % "test")
