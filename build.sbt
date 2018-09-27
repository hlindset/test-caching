import com.typesafe.sbt.packager.docker._
import Dependencies._

// Common settings
ThisBuild / name := "hoopla-finatra"
ThisBuild / organization := "no.hoopla"
ThisBuild / version := "2.0"
ThisBuild / scalaVersion := "2.12.4"

// Cache dependency resolution
ThisBuild / updateOptions := updateOptions.value.withCachedResolution(true)

// Disable scaladoc/javadoc in docker:stage (sbt-native-packager)
ThisBuild / packageDoc / mappings := Seq()
ThisBuild / packageDoc / publishArtifact := false

// Disable source package in docker:stage (sbt-native-packager)
ThisBuild / packageSrc / publishArtifact := false

// Global dependencies
ThisBuild / libraryDependencies ++= Seq(
  scalaTest
)

lazy val root = (project in file("."))
  .dependsOn(
    modulea,
    moduleb
  )
  .aggregate(
    modulea,
    moduleb
  )

lazy val modulea = (project in file("modulea"))

lazy val moduleb = (project in file("moduleb"))
  .dependsOn(modulea)
  .enablePlugins(
    JavaAppPackaging
  )
