name := "test"

organization := "none"

scalaVersion := "2.11.7"

routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file("."))
    .enablePlugins(PlayScala)

