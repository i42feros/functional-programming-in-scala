# functional-programming-in-scala

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/82d69ab70ba74e3b891722bcbf19a677)](https://www.codacy.com/app/i42feros/functional-programming-in-scala?utm_source=github.com&utm_medium=referral&utm_content=i42feros/functional-programming-in-scala&utm_campaign=badger)

Exercises: 
 - Chapter 2: Package: gettingstarted
  - Exercise 2.1:
    Write a function to compute the nth fibonacci number

  - Exercise 2.2:
    Implement a polymorphic function to check whether an `Array[A]` is sorted

  - Exercise 2.3:
    Let's look at another example, currying, which converts a function f of two arguments into a function of one argument
    that partially applies f. Here again there's only one implementation that compiles. Write this implementation
    def curry[A,B,C](f: (A, B) => C): A => (B => C)

  - Exercise 2.4:
    Implement uncurry, which reverses the transformation of curry. Note that since => associates to the right, A => (B => C) can be written as A => B => C.
    def uncurry[A,B,C](f: A => B => C): (A, B) => C

  - Exercise 2.5:
    Implement the higher-order function that composes two functions:
    def compose[A,B,C](f: B => C, g: A => B): A => C