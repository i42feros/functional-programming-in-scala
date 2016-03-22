package functional.programming

/**
 * Created by sonia on 22/03/2016.
 * Exercise 2.1
 */
object FibonacciCalculator {
  def fib(n: Int): Int = {
    def loop(i: Int, nth: Int, fib: List[Int]): Int = {
      if (nth == i) {
        fib.head
      } else {
        loop(i + 1, nth, fib.take(2).sum :: fib)
      }
    }
    loop(0, n, List(1, 0))
  }
}
