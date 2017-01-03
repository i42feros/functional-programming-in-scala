package functional.programming.gettingstarted

import org.scalatest.{Matchers, WordSpec}

/**
 * Created by sonia on 02/04/2016.
 */
class CurryOperatorSpec extends WordSpec with Matchers {

  "CurryOperatorSpec" should {

    "curry" in {
      def multiply(a: Int, b: Int): Int = a * b
      def multiplyCurry: (Int) => (Int) => Int = CurryOperator.curry(multiply)

      multiplyCurry(2)(3) should be(multiply(2, 3))
    }

    "uncurry" in {
      def multiply(a: Int, b: Int): Int = a * b
      def multiplyCurry: (Int) => (Int) => Int = CurryOperator.curry(multiply)
      def multiplyUnCurry: (Int, Int) => Int = CurryOperator.uncurry(multiplyCurry)

      multiplyUnCurry(2,3) should be(multiply(2, 3))
    }

    "compose" in {
      def calculateSin(b: Double): Double = Math.sin(b)
      def productOfTwo(a: Double): Double = a * 2
      def sinOfProduct = CurryOperator.compose(calculateSin, productOfTwo)

      sinOfProduct(3) should be(calculateSin(3 * 2))
    }
  }
}
