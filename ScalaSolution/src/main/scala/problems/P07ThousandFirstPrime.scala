package main.scala.problems

import scala.collection.mutable
import scala.util.control.Breaks._

/**
  * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
  * What is the 10,001st prime number?
  */
object P07ThousandFirstPrime {
  println("Problem 7: 10,001st Prime")

  var primes: mutable.ListBuffer[Long] = mutable.ListBuffer.empty
  primes += 2
  primes += 3
  var possiblePrime: Long = primes.last + 2

  while (primes.size < 10001) {
    var isPrime: Boolean = true
    breakable {
      for (i <- primes) {
        if (i > Math.sqrt(possiblePrime)) break
        else if (possiblePrime % i == 0) {
          isPrime = false
          break
        }
      }
    }
    if (isPrime) primes += possiblePrime
    possiblePrime += 2
  }

  println (primes.last)

}
