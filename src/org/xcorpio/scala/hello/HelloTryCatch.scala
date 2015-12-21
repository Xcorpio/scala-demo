package org.xcorpio.scala.hello

object HelloTryCatch {
  
  def testReturnFinally(): Int = {
    try {
      return 1
    } finally {
      return 2
    }
  }
  
  def testTry(): Int = {
    try {
      3
    } finally {
      4
    }
  }
  def main(args: Array[String]): Unit = {
    try {
      throw new IllegalArgumentException("hi")
    } catch {
      case ex: IllegalArgumentException => ex.printStackTrace() // TODO: handle error
      case ex: Exception => println(ex.getMessage)
    } finally {
      println("finally")
    }
    // finally 块中return 才返回 ，fuzzy,you'd better just clear something in finally block rather than return a value
    println(testReturnFinally)
    println(testTry)
  }
}