import play.PlayImport._
import play.PlayScala


organization := "com.syedatifakhtar"

name := "custom-goose-7788"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.0"

herokuJdkVersion in Compile := "1.7"

herokuAppName in Compile := "custom-goose-7788"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers ++= Seq(
  "Atlassian Releases" at "https://maven.atlassian.com/public/",
  "JCenter repo" at "https://bintray.com/bintray/jcenter/",
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "2.48.2",
  "junit" % "junit" % "4.8.1" % "test",
  "org.slf4j" % "slf4j-api" % "1.6.1" % "compile",
  "org.jsoup" % "jsoup" % "1.7.2",
  "commons-lang" % "commons-lang" % "2.6"
)

