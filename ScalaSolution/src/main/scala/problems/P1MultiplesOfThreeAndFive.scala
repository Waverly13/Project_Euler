package main.scala.problems

/**
  * Problem 1
  * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  * The sum of these multiples is 23.
  * Find the sum of all the multiples of 3 or 5 below 1000.
  */
object P1MultiplesOfThreeAndFive {
  println("Problem 1: Multiples of 3 and 5")
  var count: Int = 0
  for (i <- 0 to 999) {
    if (i%3==0 || i%5==0) count = count+i
  }
  println (count)
}
