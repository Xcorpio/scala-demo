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
    println(s toUpperCase)
    println('a' - 'b')
    println('e' >= 'f')
    println( 4.5f / 2.2f)
    println(~1)
    println(3 & 2)
    println(("he" + "llo") == "hello")
    println(List(1,2,3) == List(1,2,3))
  }
}