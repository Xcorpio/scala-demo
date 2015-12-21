package org.xcorpio.scala.hello

object HelloArguments {
  
  // 变长参数
  def echo(args: String*): Unit = {
    for(arg <- args)
      println(arg)
  }
  
  // 命名参数
  def speed(distance: Float, time: Float): Float = 
    distance / time
    
  // 默认参数值
  def printTime(out: java.io.PrintStream = Console.out, divisor: Int = 1): Unit = 
    out.println("time :" + System.currentTimeMillis() / divisor)
  
  def main(args: Array[String]): Unit = {
    // 可变长参数
    echo("one", "two", "three")
    val list = List("one", "two", "three")
    // _* 告诉scala编译器逐个传入数组中的元素，而不是传入整个数组对象
    echo(list: _*)
    
    val sp = speed(12.4F, 1.1F)
    println(sp)
    // 命名参数,参数位置可调整
    println(speed(distance = 100, time = 10))
    println(speed(time = 10, distance = 100))
    
    // 有默认值得参数
    printTime()
    printTime(divisor = 10)
  }
}