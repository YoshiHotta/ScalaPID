name := "ScalaPID"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies++=Seq(
  "org.apache.logging.log4j" % "log4j-api" % "2.8.2",
  "org.apache.logging.log4j" % "log4j-core" % "2.8.2",
  "org.apache.logging.log4j" %% "log4j-api-scala" % "11.0",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.mockito" % "mockito-core" % "2.8.47" % "test"
)
