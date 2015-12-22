package org.xcorpio.scala.hello

import java.io.File
import java.io.PrintWriter
import java.util.Date

object CustomControlStructure {
  
  def main(args: Array[String]): Unit = {
    def twice(op: Double => Double, x: Double) = op(op(x))
    
    println(twice(_ + 1, 5))
    
    def withPrintWriter(file: File, op: PrintWriter => Unit) = {
      val writer = new PrintWriter(file)
      try {
        op(writer)
      } catch {
        case t: Throwable => t.printStackTrace()
      } finally {
        writer.close()
      }
    }
    
    def withPrintWriter2(file: File)(op: PrintWriter => Unit) = {
      val writer = new PrintWriter(file)
      try {
        op(writer)
      } finally {
        writer.close()
      }
    }
    
    withPrintWriter(new File("test.txt"), _.println(new Date))
    /*
     *  第一个参数我们还是使用（）（我们也可以使用{}),第二个参数我们使用{}来替代(),
     *  这样修改过的代码使得withPrintWriter 看起来和Scala内置的控制结构语法一样。
     */
    withPrintWriter2(new File("test.txt")){
      _.println(new Date)  // writer => writer.println(new Date)
    }
    // when only one parameter can use both {} and ()
    println ("hello","f")
    println {"hi"}
  }
}