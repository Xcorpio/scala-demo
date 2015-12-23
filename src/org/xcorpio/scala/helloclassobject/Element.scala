package org.xcorpio.scala.helloclassobject

abstract class Element {
  // abstract method
  def contents: Array[String]
  // 不带参数也没有副作用的方法为无参数方法，省略空括号；带有副作用的比如IO,println()一般带空括号，否则看上去像访问一个字段
  def height: Int = contents.length
  def width: Int = if(height == 0) 0 else contents(0).length
  def demo: Unit = println("Element's implementation is invoked~")
}

object Element {
  def main(args: Array[String]): Unit = {
    println("hi")
    // class 有对应 object不用 new，实际调用apply()方法
    println(Array(1,2,3).length)
    // "abc".length 没有副作用一般不加()
    println("abc".length)
  }
}
