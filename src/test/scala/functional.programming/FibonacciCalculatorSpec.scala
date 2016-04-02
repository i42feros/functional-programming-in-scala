package functional.programming

import org.scalatest.{Matchers, WordSpec}

/**
 * Created by sonia on 22/03/2016.
 */
class FibonacciCalculatorSpec extends WordSpec with Matchers {
  "FibonacciCalculator" should {
    "calculate the 1st number fibonacci" in {
      val fibonacci = FibonacciCalculator.fib(1)

      fibonacci should be(1)
    }

    "calculate the 2st number fibonacci" in {
      val fibonacci = FibonacciCalculator.fib(2)

      fibonacci should be(2)
    }


    "calculate the 4th number fibonacci" in {
      val fibonacci = FibonacciCalculator.fib(4)

      fibonacci should be(5)
    }

    "calculate the 8th number fibonacci" in {
      val fibonacci = FibonacciCalculator.fib(5)

      fibonacci should be(8)
    }
  }
}
