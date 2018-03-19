
import sbt._

lazy val chirp_streams_on = (project in file("."))
  .aggregate(
    common,
    exercises
  )
  .settings(CommonSettings.commonSettings: _*)
lazy val common = project.settings(CommonSettings.commonSettings: _*)

lazy val exercises = project
  .settings(CommonSettings.commonSettings: _*)
  .dependsOn(common % "test->test;compile->compile")
       