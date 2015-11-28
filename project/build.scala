import sbt._
object OAuthExample extends Build
{
  lazy val root =
    Project("root", file(".")) dependsOn(dispatchLiftJson)
  lazy val dispatchLiftJson =
    uri("git://github.com/yuriylesyuk/dispatch-lift-json")
}