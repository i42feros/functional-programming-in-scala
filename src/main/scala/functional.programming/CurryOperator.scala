package functional.programming

/**
 * Exercise 2.3, 2.4
 * Created by sonia on 02/04/2016.
 */
object CurryOperator {
  def curry[A,B,C](f: (A, B) => C): A => (B => C) =
    (a: A) => ((b: B) => f(a, b))

  def uncurry[A,B,C](f: A => B => C): (A, B) => C =
    (a: A, b: B) => f(a)(b)
}
