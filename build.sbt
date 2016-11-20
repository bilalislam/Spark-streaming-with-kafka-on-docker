name := "streaming_data"

version := "1.0"

scalaVersion := "2.11.4"

val sparkVersion = "1.6.0"


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  ("org.apache.spark" %% "spark-streaming-kafka" % sparkVersion) exclude ("org.spark-project.spark", "unused")
)

assemblyJarName in assembly := name.value + ".jar"