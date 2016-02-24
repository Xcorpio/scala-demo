package org.xcorpio.scala.fortheimpatient.chapter2

import java.text.MessageFormat

object VariableArguments {
  def main(args: Array[String]): Unit = {
    println(sum(1, 2, 4))
    println(sum(2, 2, 2, 2, 2))
    println(sum(1 to 10: _*)) // consider 1 to 10 as an argument sequence
    val seq = 1 to 10
    println(seq.head)
    println(seq.tail)
    println("recursiveSum:" + recursiveSum(1 to 10: _*))
    val result = MessageFormat.format("{0} ,{1}", "hello", 11.asInstanceOf[AnyRef])
    println(result)
  }

  def sum(args: Int*) = {
    var total = 0
    for (i <- args) total += i
    total
  }

  def recursiveSum(args: Int*): Int = {
    println(args)
    if (args.length == 0) 0
    else args.head + recursiveSum(args.tail: _*)
  }
}