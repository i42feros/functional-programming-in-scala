# functional-programming-in-scala

## Chapter 2. Getting started with functional programming in Scala.
  Package: `gettingstarted`
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

## Chapter 3. Functional data structures
  Package: `datastructures`
  - Exercise 3.2: Implement the function tail for removing the first element of a List. Note that the function takes constant time. What are different choices you could make in your implementation if the List is Nil? We’ll return to this question in the next chapter.
  - Exercise 3.3: Using the same idea, implement the function setHead for replacing the first element of a List with a different value.
  - Exercise 3.4: Generalize tail to the function drop, which removes the first n elements from a list. Note that this function takes time proportional only to the number of elements being dropped—we don’t need to make a copy of the entire List.
  - Exercise 3.5: Implement dropWhile, which removes elements from the List prefix as long as they match a predicate.
  - Exercise 3.6: Implement a function, init, that returns a List consisting of all but the last element of a List. So, given List(1,2,3,4), init will return List(1,2,3). Why can’t this function be implemented in constant time like tail?
  - Exercise 3.9: Compute the length of a list using foldRight.
  - Exercise 3.10: Our implementation of foldRight is not tail-recursive and will result in a StackOver- flowError for large lists (we say it’s not stack-safe). Convince yourself that this is the case, and then write another general list-recursion function, foldLeft, that is tail-recursive, using the techniques we discussed in the previous chapter.
  - Exercise 3.11: Write sum, product, and a function to compute the length of a list using foldLeft.
  - Exercise 3.12: Write a function that returns the reverse of a list (given List(1,2,3) it returns List(3,2,1)). See if you can write it using a fold.
  - Exercise 3.13: Hard: Can you write foldLeft in terms of foldRight? How about the other way around? Implementing foldRight via foldLeft is useful because it lets us implement foldRight tail-recursively, which means it works even for large lists without overflow- ing the stack.
  - Exercise 3.14: Implement append in terms of either foldLeft or foldRight.
  - Exercise 3.15: Hard: Write a function that concatenates a list of lists into a single list. Its runtime should be linear in the total length of all lists.
  - Exercise 3.16: Write a function that transforms a list of integers by adding 1 to each element. (Reminder: this should be a pure function that returns a new List!)
  - Exercise 3.17: Write a function that turns each value in a List[Double] into a String. You can use the expression d.toString to convert some d: Double to a String.
