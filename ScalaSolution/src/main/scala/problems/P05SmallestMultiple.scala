package main.scala.problems

/**
  * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
  * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
  */
object P05SmallestMultiple {
  println("Problem 5: Smallest Multiple")

  var i: Int = 20
  var increase: Int = i
  var mult: Int = i

  while (i >= 1) {
    if (mult % i == 0) {
      increase = mult
      i -= 1
    }
    else mult += increase
  }

  println (mult)

}
