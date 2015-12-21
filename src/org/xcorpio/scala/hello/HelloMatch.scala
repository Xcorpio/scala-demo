package org.xcorpio.scala.hello

object HelloMatch {
  
  def testMatch(t: String): Unit = {
    t match {
      case "1" => println("value is 1")
      case "2" => println("value is 2")
      case _ => println("defalut")
    }
  }
  
  def testMatch2(s: String) :String = {
    s match {
      case "1" => "1"
      case "2" => "2"
      case _ => "default"
    }
  }
  
  def main(args: Array[String]): Unit = {
    testMatch("1")
    testMatch("4")
    println(testMatch2("1"))
    println(testMatch2("7"))
  }
}