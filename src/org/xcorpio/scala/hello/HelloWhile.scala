package org.xcorpio.scala.hello

import scala.io.StdIn

object HelloWhile {
  
  def gcdLoop(x: Long, y:Long): Long = {
    var a = x
    var b = y
    while(a != 0) {
      var tmp = a
      a = b % a
      b = tmp
    }
    b
  }
  
  def gcd(x: Long, y: Long): Long = {
    if(y == 0) x else gcd(y, x % y)
  }
  
  def doReadLine(): Unit = {
    var line = "Please input something:"
    do {
      println("Read:" + line)
      line = StdIn.readLine()
    } while (line != "")
  }
  
  def readLineTwo(): Unit = {
    var line = "Please input something:"
    println(line)
    // 赋值语句返回Unit 和 String 比较yield返回true
    while ((line = StdIn.readLine()) != "") {
      println(line)
    }
  }
  
  def main(args: Array[String]): Unit = {
    val ret = gcdLoop(3, 6)
    println(ret)
    val ret2 = doReadLine()
    println(ret2 == ())
    readLineTwo()
  }
}