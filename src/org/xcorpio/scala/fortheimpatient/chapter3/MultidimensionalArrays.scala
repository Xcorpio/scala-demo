package org.xcorpio.scala.fortheimpatient.chapter3

object MultidimensionalArrays {
  def main(args: Array[String]): Unit = {
    val matrix = Array.ofDim[Double](3, 4)
    matrix(2)(2) = 2
    println(matrix(2)(2))
  }
}