package org.xcorpio.scala.fortheimpatient.chapter1

object ApplyMethod {
  def main(args: Array[String]): Unit = {
    val s = "123456"
    println(s(0))
    println(s apply 0)
    println(s apply(0))
    println("abc"(2))
    println(BigInt.apply("123324234"))
    println(Array(1,2,3,4))
    println(-4)
    println(4.unary_-)
    println(~4)
    println(4.unary_~)
  }
}