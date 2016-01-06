package org.xcorpio.scala.helloclassobject

object ValueType {
  
  def isEqual(x: Int, y: Int) = x == y
  def isEqual(x: Any, y: Any) = x == y
  
  def main(args: Array[String]): Unit = {
    println(isEqual(4, 4))
    println(isEqual("x", "x"))
    val x = new String("x")
    val y = new String("x")
    println(x eq y)
    println(x ne y)
  }
}