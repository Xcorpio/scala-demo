package org.xcorpio.scala

object HelloForEach {
  def main(args: Array[String]): Unit = {
    val greetStrings = new Array[String](3)
    greetStrings(0) = "hello"
    greetStrings(1) = "ni"
    greetStrings(2) = "hao"
    greetStrings.update(0, "haha")
    println(greetStrings.apply(0))
    //dispalyArrau(greetStrings)
    //forEach()
    //intTo()
    getArrayTwo()
  }
  def getArrayOne(): Unit = {
    val array = Array.apply("ss", "ni", "ssss")
    println(array)
    for (a <- array) {
      println(a)
    }
  }
  def getArrayTwo(): Unit = {
    val array = Array("ni", "hao", "a")
    for (a <- array) {
      println(a)
    }
  }

  def dispalyArrau(args: Array[String]): Unit = {
    for (i <- 0 to 2)
      println(args(i))
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    for (arg <- args)
      println(arg)
  }

  def forEach(): Unit = {
    for (i <- 3 to 6)
      println(i)
  }

  def intTo(): Unit = {
    for (i <- 1.to(4))
      println(i)
  }

}