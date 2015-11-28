package code
package snippet

import org.specs2.mutable._
import net.liftweb._
import http._
import net.liftweb.util._
import net.liftweb.common._
import org.specs2.matcher._
import Helpers._
import lib._

import org.specs2.runner.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class HelloWorldTestSpecs extends Specification {
  val session = new LiftSession("", randomString(20), Empty)

  "HelloWorld Snippet" should {
    "Put the time in the node" in {
      S.initIfUninitted(session) {
        val stableTime = now
        DependencyFactory.time.doWith(stableTime) {
          val hello = new HelloWorld
          Thread.sleep(1000) // make sure the time changes
    
          val str = hello.howdy(<span>Welcome to your Lift app at <span id="time">Time goes here</span></span>).toString
    
          str.indexOf(stableTime.toString) must be >= 0
          str.indexOf("app at") must be >= 0
        }  
      }
     }
  }
}
