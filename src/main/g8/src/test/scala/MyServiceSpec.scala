package $organization$.$name;format="lower,word"$

import org.scalatest.{WordSpec,MustMatchers}
import spray.testkit.ScalatestRouteTest
import spray.http._
import StatusCodes._

class MyServiceSpec extends WordSpec with MustMatchers with ScalatestRouteTest with MyService {
  def actorRefFactory = system
  
  "MyService" should {

    "return a greeting for GET requests to the root path" in {
      Get() ~> myRoute ~> check {
        responseAs[String] must include("Say hello")
      }
    }

    "leave GET requests to other paths unhandled" in {
      Get("/kermit") ~> myRoute ~> check {
        handled must be(false)
      }
    }

    "return a MethodNotAllowed error for PUT requests to the root path" in {
      Put() ~> sealRoute(myRoute) ~> check {
        status === MethodNotAllowed
        responseAs[String] === "HTTP method not allowed, supported methods: GET"
      }
    }
  }
}
