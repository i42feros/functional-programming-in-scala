# functional-programming-in-scala

Exercises: 
 - Chapter 2
  - Exercise 2.1

  - Exercise 2.2

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