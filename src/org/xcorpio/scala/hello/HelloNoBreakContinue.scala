package org.xcorpio.scala.hello
import scala.io._
import scala.util.control.Breaks._

object HelloNoBreakContinue {
  
  def noContinueAndBreak(): Unit = {
    val array = List("1", "2", "3")
    
  }
  
  def breakable {
    while(true) {
      println("?")
      if(StdIn.readLine() == "") break
    }
  }
  
  def main(args: Array[String]): Unit = {
    breakable
  }
}