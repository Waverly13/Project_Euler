package main.scala.problems

import scala.util.control.Breaks._

/**
  * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
  * a^2 + b^2 = c^2
  * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
  * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  * Find the product abc.
  */
object P9SpecialPythagoreanTriplet {
  println("Problem 9: Special Pythagorean Triplet")

  val sum: Int = 1000
  var product: Int = 0

  for (a <- 1 to sum/2) {
    breakable {
      for (b <- a+1 to sum/2) {
        val k: Int = (Math.pow(a, 2) + Math.pow(b, 2)).toInt
        val possibleC: Double = Math.sqrt(k)
        if (a + b + possibleC > sum) break
        else if (possibleC.isValidInt && a + b + possibleC == sum) {
          product = a * b * possibleC.toInt
        }
      }
    }
  }

  println (product)

}

