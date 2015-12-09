package org.xcorpio.scala.hello

import scala.io.Source

object HelloFileRead {
  def main(args: Array[String]): Unit = {
    for(line <- Source.fromFile("pom.xml").getLines())
      println(line.length + " " + line)
    Console.err.println("console err")
  }
}