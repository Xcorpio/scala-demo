package org.xcorpio.scala.hello

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello world!");
    println(max(4, 5))
    greet()
    val greetStrings = new Array[String](3)
    greetStrings(0) = "hello"
    greetStrings(1) = "ni"
    greetStrings(2) = "hao"
    displayArray(greetStrings)
  }

  def max(a: Int, b: Int): Int = {
    if (a > b) {
      a
    } else {
      b
    }
  }
  
  def greet() = println("hello world")
  
  def displayArray(args: Array[String]): Unit = {
    args.foreach { x => println(x) }
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    args.foreach { println }
    var ret  = println("ji")
    println(ret)
  }
}
