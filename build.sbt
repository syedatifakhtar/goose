organization := "com.syedatifakhtar"

name := "CustomGoose"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "2.48.2",
  "junit" % "junit" % "4.8.1" % "test",
  "org.slf4j" % "slf4j-api" % "1.6.1" % "compile",
  "org.jsoup" % "jsoup" % "1.7.2",
  "commons-lang" % "commons-lang" % "2.6"
)

