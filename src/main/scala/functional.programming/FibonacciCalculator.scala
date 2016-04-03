package functional.programming

import scala.annotation.tailrec

/**
 * Exercise 2.1
 * Created by sonia on 22/03/2016.
 */
object FibonacciCalculator {
  def fib(n: Int): Int = {
    @tailrec
    def loop(i: Int, fib: List[Int]): Int = {
      if (i == 0) {
        fib.head
      } else {
        loop(i - 1, fib.take(2).sum :: fib)
      }
    }
    loop(n, List(1, 0))
  }
}
