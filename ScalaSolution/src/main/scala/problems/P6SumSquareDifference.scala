package main.scala.problems

/**
  * The sum of the squares of the first ten natural numbers is,
  *   1^2 + 2^2 + ... + 10^2 = 385
  * The square of the sum of the first ten natural numbers is,
  *   (1 + 2 + ... + 10)^2 = 55POW2 = 3025
  * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum
  * is 3025 − 385 = 2640.
  * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
  */
object P6SumSquareDifference {
  println("Problem 6: Sum Square Difference")

  var sumSquare: Long = 0L
  var squareSum: Long = 0L

  for (i <- 1 to 100) {
    sumSquare += i*i
    squareSum += i
  }

  val r: Long = squareSum*squareSum - sumSquare
  println (r)

}
