import com.github.retronym.SbtOneJar._

oneJarSettings

name := "edge-bidconfirmation-mock"

version := "1.0-SNAPSHOT"

libraryDependencies ++= {
  val akkaV = "2.5.32"
  val sprayV = "1.3.1"
  Seq(
    "io.spray"            %%   "spray-can"     % sprayV,
    "io.spray"            %%   "spray-routing" % sprayV,
    "io.spray"            %%   "spray-testkit" % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % "3.9.5" % "test"
  )
}

scalaVersion := "2.11.12"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

