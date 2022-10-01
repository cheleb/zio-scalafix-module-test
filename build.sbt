val scala3Version = "2.13.9"

ThisBuild / scalafixDependencies +=
  "dev.cheleb" %% "zio-module-pattern" % "0.0.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "zio-scalafix-module-test",
    version := "0.1.0-SNAPSHOT",
   
    scalaVersion := scala3Version,
    semanticdbEnabled := true, // enable SemanticDB
    semanticdbVersion := scalafixSemanticdb.revision,
    scalafixOnCompile := true,
    libraryDependencies += "dev.zio" %% "zio-streams" % "2.0.2"
  )
