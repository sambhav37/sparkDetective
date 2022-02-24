name := "sparkDetective"

version := "0.1"

version := "0.18-SNAPSHOT"

scalaVersion := "2.12.10"
crossScalaVersions := Seq("2.11.12", "2.12.10")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

isSnapshot := true

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.8"
libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.13.0"
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.26"
libraryDependencies += "org.influxdb" % "influxdb-java" % "2.14"
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.7" % "test"
libraryDependencies += "com.github.tomakehurst" % "wiremock" % "2.23.2" % "test"

// publishing to Sonatype Nexus repository and Maven
publishMavenStyle := true

organization := "io.github.sambhav37"
description := "This project is for catching metrics of Apache Spark workloads."
developers := List(Developer(
  "io.github.sambhav37", "Kumar Sambhav", "sambhav.kumar37@gmail.com",
  url("https://github.com/LucaCanali")
))
homepage := Some(url("https://github.com/sambhav37/sparkDetective"))

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/sambhav37/sparkDetective"),
    "scm:git@github.com:sambhav37/sparkDetective.git"
  )
)
