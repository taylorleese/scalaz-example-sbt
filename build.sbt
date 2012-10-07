name := "scalaz-example-sbt"

organization := "com.stackmob"

version := "0.0.0-SNAPSHOT"

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= {
  Seq(
    "org.scalaz" %% "scalaz-core" % "6.0.4" withSources()
  )
}
