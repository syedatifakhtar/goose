
organization := "com.syedatifakhtar"

name := "custom-goose-7788"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"


lazy val root = (project in file("."))

resolvers ++= Seq(
  "Atlassian Releases" at "https://maven.atlassian.com/public/",
  "JCenter repo" at "https://bintray.com/bintray/jcenter/",
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "2.48.2",
  "junit" % "junit" % "4.11" % "test",
  "org.slf4j" % "slf4j-api" % "1.6.1" %"compile",
  "org.jsoup" % "jsoup" % "1.5.2",
  "commons-lang" % "commons-lang" % "2.6",
  "org.apache.httpcomponents" % "httpclient" %"4.1.2",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "commons-io" % "commons-io" % "2.1"
)

