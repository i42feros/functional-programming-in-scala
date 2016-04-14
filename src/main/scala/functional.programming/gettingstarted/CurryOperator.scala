package functional.programming.gettingstarted

/**
 * Exercise 2.3, 2.4, 2.5
 * Created by sonia on 02/04/2016.
 */
object CurryOperator {
  def curry[A,B,C](f: (A, B) => C): A => (B => C) =
    // (a: A) => ((b: B) => f(a, b))
    // cleaner as
    a => b => f(a, b)

  def uncurry[A,B,C](f: A => B => C): (A, B) => C =
    // (a: A, b: B) => f(a)(b)
    // cleaner as
    (a, b) => f(a)(b)

  def compose[A,B,C](f: B => C, g: A => B): A => C =
    // (a: A) => f(g(a))
    // cleaner as
    a => f(g(a))
}
