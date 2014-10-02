name := """psss"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
  .settings(scalariformSettings:_*) // https://github.com/sbt/sbt-scalariform
  .settings(scalikejdbcSettings:_*) // http://scalikejdbc.org/documentation/setup.html
  .settings(instrumentSettings:_*)  // https://github.com/scoverage/sbt-scoverage
  .settings(net.virtualvoid.sbt.graph.Plugin.graphSettings:_*) // https://github.com/jrudolph/sbt-dependency-graph

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalikejdbc"        %% "scalikejdbc"                       % "2.1.2",
  "org.scalikejdbc"        %% "scalikejdbc-play-plugin"           % "2.3.2",
  "org.scalikejdbc"        %% "scalikejdbc-syntax-support-macro"  % "2.1.2",
  "org.skinny-framework"   %% "skinny-orm"                        % "1.3.2",
  "mysql"                  %  "mysql-connector-java"              % "5.1.32",
  "com.github.nscala-time" %% "nscala-time"                       % "1.4.0",
  "org.json4s"             %% "json4s-jackson"                    % "3.2.10"
)

