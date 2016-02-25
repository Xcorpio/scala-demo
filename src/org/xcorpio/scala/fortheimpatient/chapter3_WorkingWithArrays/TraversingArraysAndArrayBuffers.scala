package org.xcorpio.scala.fortheimpatient.chapter3_WorkingWithArrays

object TraversingArraysAndArrayBuffers {
  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 3, 4)
    for (i <- 0 until a.length) {
      println(i + ": " + a(i))
    }

    for (i <- a) print(i + " ")
    println()

    for (i <- 0 until (a.length, 2)) println(i + ": " + a(i))
  }
}