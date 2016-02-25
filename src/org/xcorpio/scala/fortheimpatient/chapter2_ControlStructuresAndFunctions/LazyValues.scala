package org.xcorpio.scala.fortheimpatient.chapter2_ControlStructuresAndFunctions

object LazyValues {
  def main(args: Array[String]): Unit = {
    lazy val words = scala.io.Source.fromFile("pom.xmll").mkString
    println("lazy lazy before throw exception...")
    println(words)
  }
}