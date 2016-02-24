package org.xcorpio.scala.fortheimpatient.chapter3

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.mutable.Buffer

object InteroperatingWithJava {
  def main(args: Array[String]): Unit = {
    val command = ArrayBuffer("netstat", "-an")
    val pb = new ProcessBuilder(command)
    val javaCommand = pb.command()
    println(javaCommand)
    import scala.collection.JavaConversions.asScalaBuffer
    val javaCommand2: Buffer[String] = pb.command()
    println(javaCommand2)
  }
}