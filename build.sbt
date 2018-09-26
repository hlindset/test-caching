import com.typesafe.sbt.packager.docker._
import Dependencies._

ThisBuild / updateOptions := updateOptions.value.withCachedResolution(true)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "test-caching",
    libraryDependencies += scalaTest % Test
  )
