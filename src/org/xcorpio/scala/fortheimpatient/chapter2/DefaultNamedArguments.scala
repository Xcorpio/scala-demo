package org.xcorpio.scala.fortheimpatient.chapter2

object DefaultNamedArguments {
  def main(args: Array[String]): Unit = {
    println(decorate("hello"))
    println(decorate("hello", ">>>["))
    println(decorate(left = "->", str = "hello", right = "<-"))
  }

  def decorate(str: String, left: String = "[", right: String = "]") = {
    left + str + right
  }
}