package org.xcorpio.scala.fortheimpatient.chapter1_TheBasics

object FunctionsAndMethods {
  def main(args: Array[String]): Unit = {
    println(math.Pi)
    println(scala.math.Pi)
    import scala.math._
    println(sqrt(2))
    println(pow(2, 4))
    println(min(4,5))
  }
}