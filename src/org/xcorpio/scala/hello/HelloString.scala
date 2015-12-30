package org.xcorpio.scala.hello

object HelloString {
  def main(args: Array[String]): Unit = {
    val s1 = "hello"
    val s2 = "world"
    val s3 = s1 + s2
    println(s3, s3.length)
  }
}