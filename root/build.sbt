 name := "root"
 version := "1.0"
 scalaVersion := "2.12.12"

lazy val common = project.in(file("common"))
  .settings(
    libraryDependencies ++=Seq(
     "org.scalactic" %% "scalactic" % "3.3.0-SNAP3",
    "org.scalaz" %% "scalaz-core" % "7.3.2",


   "org.mockito" %% "mockito-scala-scalatest" % "1.16.13" % Test,
 "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test


)
)


lazy val rest = project.in(file("rest"))
  .settings(
libraryDependencies ++=Seq(
 "com.typesafe.akka" %% "akka-http" % "10.2.2",
 "com.typesafe.akka" %% "akka-stream" % "2.6.10",
 "com.typesafe.akka" %% "akka-actor" % "2.6.10",
 "org.json4s" %% "json4s-native" % "3.7.0-M7",

 "com.typesafe.akka" %% "akka-http-testkit" % "10.2.2" % Test,
 "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.10" %Test,
 "com.typesafe.akka" %% "akka-testkit" % "2.6.10" % Test

)
).dependsOn(common)


lazy val root = project.in(file(".")).aggregate(common,rest) 