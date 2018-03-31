package main.scala.problems

import scala.collection.mutable

/**
  * Problem 3
  * The prime factors of 13195 are 5, 7, 13 and 29.
  * What is the largest prime factor of the number 600851475143 ?
  */
object P3LargestPrimeFactor {
  println("Problem 3: Largest Prime Factor")

  var num: Long = 600851475143L
  var primes: mutable.ListBuffer[Int] = mutable.ListBuffer.empty

  while (num % 2 == 0) {
    primes += 2
    num = num / 2
  }

  for (i <- 3 to Math.sqrt(num).floor.toInt if i % 2 != 0) {
    if (num % i == 0) {
      num = num / i
      primes += i
    }
  }

  println (primes.max)
}
