name := "HouseSearch"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.apache.nutch" % "nutch" % "2.2.1",
  "org.hibernate" % "hibernate-entitymanager" % "4.2.6.Final",
  "mysql" % "mysql-connector-java" % "5.1.26",
  "com.google.inject" % "guice" % "3.0",
  "javax.inject" % "javax.inject" % "1"
)     

play.Project.playScalaSettings
