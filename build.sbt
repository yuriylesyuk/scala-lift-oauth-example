name := "oauthexample"
 
scalaVersion :=  "2.11.6"

resolvers ++= Seq(
  "Scala Tools Releases" at "http://scala-tools.org/repo-releases/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
  "releases" at "http://oss.sonatype.org/content/repositories/releases",
  "Gradle libs" at "http://gradle.artifactoryonline.com/gradle/libs/"
)

libraryDependencies ++= {
  val liftVersion = "2.6+" // Put the current/latest lift version here
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-wizard" % liftVersion % "compile->default")
}

// Customize any further dependencies as desired
libraryDependencies ++= Seq(
  "com.h2database"	  %	"h2"				% "1.4.185",
  "org.eclipse.jetty" % "jetty-webapp" % "9.3.6.v20151106",
  "net.databinder" %% "dispatch-core" % "0.8.10",
  "net.databinder" %% "dispatch-oauth" % "0.8.10",
  "net.databinder" %% "dispatch-http-json" % "0.8.10",
  "org.specs2" %% "specs2-core" % "3.6.5" % "test", // For specs.org tests
  "org.specs2" %% "specs2-junit" % "3.6.5" % "test",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.slf4j" % "slf4j-log4j12" % "1.6.4"
)

scalacOptions in Test ++= Seq("-Yrangepos")

jetty()
