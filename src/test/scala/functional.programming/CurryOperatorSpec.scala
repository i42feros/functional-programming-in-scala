package functional.programming

import org.scalatest.{Matchers, WordSpec}

/**
 * Created by sonia on 02/04/2016.
 */
class CurryOperatorSpec extends WordSpec with Matchers {

  "CurryOperatorSpec" should {

    "curry" in {
      def multiply(a: Int, b: Int): Int = a * b
      def multiplyCurry =  CurryOperator.curry(multiply)

      multiplyCurry(2)(3) should be(multiply(2, 3))
    }

  }
}
