package org.xcorpio.scala.hello

import java.io.File
import java.io.PrintWriter
import sun.util.calendar.JulianCalendar.Date

/**
 * 函数传递两种模式：传值，传引用，按名称传递
 */
object TransferNamedParameter {
  
  def main(args: Array[String]): Unit = {
    var assertionEnabled = true
    // 按值传递，传递的时函数类型的值
    def myAssert(predicate: () => Boolean) = {
      if(assertionEnabled && !predicate())
        throw new AssertionError
    }
    
    // 参数为按名称传递的参数
    def myNameAssert(predicate: => Boolean) = {
      if(assertionEnabled && !predicate)
        throw new AssertionError
    }
    myAssert(() => 4 > 3)
    //myNameAssert{4 > 4}
    
    def boolAssert(predicate: Boolean) = {
      if(assertionEnabled && !predicate) throw new AssertionError
    }
    
    //boolAssert(2 / 0 == 0)
    //myNameAssert(2 / 0 == 0)
    
    def myHelloWorld(op: => Unit) {
      println("before op")
      op
      println("after op")
    }
    
    /*myHelloWorld {
      val file = new File("test.txt")
      val writer = new PrintWriter(file)
      try {
        writer.println(new java.util.Date)
      } finally {
        writer.close()
      }
    }*/
    myHelloWorld(println("do something"))
  }
}