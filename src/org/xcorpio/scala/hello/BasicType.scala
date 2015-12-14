package org.xcorpio.scala.hello

object BasicType {
  def main(args: Array[String]): Unit = {
    println(-3.4.abs)
    println(1 max 5)
    println(4 to 6)
    println((1).+(3))
    val s = "Hello, World"
    println(s indexOf 'o')
    println(2.0.unary_-)
  }
}