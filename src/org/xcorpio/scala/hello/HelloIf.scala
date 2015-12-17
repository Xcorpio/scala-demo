package org.xcorpio.scala.hello

object HelloIf {
  def main(args: Array[String]): Unit = {
    val ret = if(!args.isEmpty) "not empty" else "empty"
    println(ret)
  }
}