package main.scala.problems

import scala.collection.mutable
import scala.util.control.Breaks._

/**
  * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
  * Find the sum of all the primes below two million.
  */
object P10SummationOfPrimes {
  println("Problem 10: Summation Of Primes")

  var primes: mutable.ListBuffer[Int] = mutable.ListBuffer.empty
  primes += 2
  primes += 3
  var summation: Long = primes.sum
  var possiblePrime: Int = primes.last + 2

  var count: Int = 0
  while (possiblePrime < 2000000) {
    val isPrime: Boolean = checkIfPrime(possiblePrime)
    if (isPrime) {
      primes += possiblePrime
      summation += possiblePrime.toLong
    }
    if (count < 4) {
      possiblePrime += 2
      count += 1
    } else {
      possiblePrime += 4
      count = 1
    }

  }

  println (summation)

  def checkIfPrime(possiblePrime: Int): Boolean = {
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
    isPrime
  }

}
