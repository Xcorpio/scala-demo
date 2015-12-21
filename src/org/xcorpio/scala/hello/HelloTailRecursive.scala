package org.xcorpio.scala.hello

object HelloTailRecursive {
  
  def isGoodEnough(guess: Double): Boolean =
    true
  
  def improve(guess: Double): Double = 
    guess
  
  def approximate(guess: Double): Double =
    if(isGoodEnough(guess)) guess
    else approximate(improve(guess))
  
  //  非尾递归,调用栈多栈帧
  def boom(x: Int):Int = 
    if(x == 0) throw new Exception("boom")  else boom(x-1) + 1
  
  // 尾递归，调用栈单栈帧
  def bang(x: Int):Int = 
    if(x == 0) throw new Exception("bang") else bang(x-1)
  
  def main(args: Array[String]): Unit = {
    //boom(5)
    bang(5)
  }
}