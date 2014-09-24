name := """psss"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.scalikejdbc" %% "scalikejdbc"                       % "2.1.2",
  "org.scalikejdbc" %% "scalikejdbc-play-plugin"           % "2.3.1",
  "org.scalikejdbc" %% "scalikejdbc-syntax-support-macro"  % "2.1.2",
  "org.skinny-framework" %% "skinny-orm"                   % "1.3.1",
  "mysql" % "mysql-connector-java" % "5.1.31",
  "com.github.nscala-time" %% "nscala-time" % "1.2.0"
)

scalikejdbcSettings
