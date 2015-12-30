package org.xcorpio.scala.hello

object HelloArray {
  def main(args: Array[String]): Unit = {
    val arrayOne = Array("one", "two", "three")
    val arrayTwo = Array("1", "2", "3")
    val arrayThree = arrayOne ++ arrayTwo
    for(i <- arrayThree)
      println(i)
      
    val i1i2 = for((i1, i2) <- arrayOne zip arrayTwo) yield i1 + ":" + i2
    for(i3 <- i1i2)
      println(i3)
      
    println(i1i2 mkString "\n")
    println(i1i2 toString)
  }
}