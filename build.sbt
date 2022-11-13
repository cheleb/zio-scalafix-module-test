val mainScalaVersion = "2.13.10"
//val mainScalaVersion = "3.2.1"

ThisBuild / scalafixDependencies +=
  "dev.cheleb" %% "zio-module-pattern" % "0.0.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "zio-scalafix-module-test",
    version := "0.1.0-SNAPSHOT",
   
    scalaVersion := mainScalaVersion,
    semanticdbEnabled := true, // enable SemanticDB
    semanticdbVersion := scalafixSemanticdb.revision,
    scalafixOnCompile := true,
    scalafmtAll := true,
    scalafmtOnCompile := true,
    libraryDependencies += "dev.zio" %% "zio-streams" % "2.0.3"
  )
