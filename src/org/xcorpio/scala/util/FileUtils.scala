package org.xcorpio.scala.util

import java.io.PrintWriter
import java.io.File

object FileUtils {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("test.data"))
    writer.println("hi")
    writer.flush()
  }
}