package org.xcorpio.scala

object HelloTuples {
  
  def main(args: Array[String]): Unit = {
    // 元组索引从1开始
    val pairs = (1, 2, "3", "你好")
    println(pairs)
    println(pairs._2)
    println(pairs._4)
  }
}