package org.xcorpio.scala.hello

object HelloSet {
  def main(args: Array[String]): Unit = {
    val set = Set("hi", "hello", "hello")
    println(set)
    mutableSet()
  }
  
  def mutableSet(): Unit = {
    val set = scala.collection.mutable.Set("ni", "hao")
    set.update("ni", false)
    set.update("nini", true)
    println(set)
  }
}