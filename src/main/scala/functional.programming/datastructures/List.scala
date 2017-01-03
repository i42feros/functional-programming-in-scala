package functional.programming.datastructures

import scala.annotation.tailrec

sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

  /* Exercise 3.2 */
  def tail[A](list: List[A]): List[A] = list match {
    case Nil => Nil // or sys.error("tail of empty list")
    case Cons(_, xs) => xs
  }

  /* Exercise 3.3 */
  def setHead[A](list: List[A], headValue: A): List[A] = list match {
    case Nil => sys.error("setHead on empty list")
    case Cons(_, xs) => Cons(headValue, xs)
  }

  /* Exercise 3.4 */
  def drop[A](l: List[A], n: Int): List[A] =
    if (n <= 0)
      l
    else l match {
      case Nil => Nil
      case Cons(_, xs) => drop(xs, n - 1)
    }

  /* Exercise 3.5 */
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Cons(h, xs) if (f(h)) => dropWhile(xs, f)
    case _ => l
  }

  def append[A](a1: List[A], a2: List[A]): List[A] =
    a1 match {
      case Nil => a2
      case Cons(h, t) => Cons(h, append(t, a2))
    }

  /* Exercise 3.6 */
  def init[A](l: List[A]): List[A] = l match {
    case Nil => sys.error("init of an empty list")
    case Cons(_, Nil) => Nil
    case Cons(h, xs) => Cons(h, init(xs))
  }

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = // Utility functions
    as match {
      case Nil => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }

  def sum2(ns: List[Int]) =
    foldRight(ns, 0)((x, y) => x + y)

  def product2(ns: List[Double]) =
    foldRight(ns, 1.0)(_ * _) // `_ * _` is more concise notation for `(x,y) => x * y`; see sidebar


  /* Exercise 3.9 */
  def length[A](as: List[A]): Int =
    foldRight(as, 0)((_, acc) => acc + 1)

  /* Exercise 3.10 */
  @tailrec
  def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B = as match {
    case Nil => z
    case Cons(x, xs) => foldLeft(xs, f(z, x))(f)
  }

  /* Exercise 3.11 */
  def sum3(ns: List[Int]) =
    foldLeft(ns, 0)(_ + _)

  def product3(ns: List[Double]) =
    foldRight(ns, 1.0)(_ * _)

  def length2[A](as: List[A]): Int =
    foldLeft(as, 0)((acc, _) => acc + 1)

  /* Exercise 3.12 */
  def reverse[A](as: List[A]): List[A] =
    foldLeft(as, Nil: List[A])((acc, h) => Cons(h,acc))

  /* Exercise 3.13 */
  def foldLeftViaFoldRight[A, B](as: List[A], z: B)(f: (B, A) => B): B =
    foldRight(as, (b: B) => b)((a, g) => b => g(f(b, a)))(z)

  def foldRightViaFoldLeft[A, B](as: List[A], z: B)(f: (A, B) => B): B =
    foldLeft(reverse(as), z)((b, a) => f(a,b))


  /* Exercise 3.14 */
  def appendViaFold[A](a1: List[A], a2: List[A]): List[A] =
    foldRight(a1,a2)(Cons(_, _))

  /* Exercise 3.15 */
  def concat[A](as: List[List[A]]): List[A] =
    foldRight(as, Nil: List[A])(append)

  /* Exercise 3.16 */
  def addOne(ints: List[Int]): List[Int] =
    foldRight(ints, Nil: List[Int])((n, as) => Cons(n + 1, as))

  /* Exercise 3.17 */
  def convertToString(doubles: List[Double]): List[String] =
    foldRight(doubles, Nil: List[String])((h, t) => Cons(h.toString, t))
}
