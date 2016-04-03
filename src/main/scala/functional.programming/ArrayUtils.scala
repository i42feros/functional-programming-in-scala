package functional.programming

import scala.annotation.tailrec

/**
 * Exercise 2.2
 * Created by sonia on 23/03/2016.
 */
object ArrayUtils {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1)
        true
      else if (!ordered(as(n), as(n + 1)))
        false
      else
        loop(n + 1)
    }

    loop(0)
  }
}
