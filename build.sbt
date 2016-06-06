// import sbtprotobuf.{ProtobufPlugin=>PB}

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8"
    )),
    // PB.protobufSettings
    libraryDependencies += "com.google.protobuf" % "protobuf-java" % "2.6.1"
  )
