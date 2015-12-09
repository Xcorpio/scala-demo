package org.xcorpio.scala.hello

object HelloList {
  
  def main(args: Array[String]): Unit = {
    listAdd()
    listAddTwo()
  }

  def listAdd(): Unit = {
    val list = 1::2::4::Nil
//    for(i <- list) {
//      println(i)
//    }
    println(list)
  }
  
  def listAddTwo(): Unit = {
    val list = Nil.::(1).::(2).::("sd")
    println(list)
  }
  
  def listAddAll(): Unit = {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwoThreeFour)
  }
}