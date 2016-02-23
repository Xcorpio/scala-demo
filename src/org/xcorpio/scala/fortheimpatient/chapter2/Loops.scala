package org.xcorpio.scala.fortheimpatient.chapter2

object Loops {
  def main(args: Array[String]): Unit = {
    for (ch <- "hello") println(ch)
    for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")
    println
    for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")
    println
    val ret = for (i <- 1 to 10) yield i
    println(ret)
  }
}