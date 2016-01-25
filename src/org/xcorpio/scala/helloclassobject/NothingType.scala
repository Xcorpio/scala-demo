package org.xcorpio.scala.helloclassobject

object NothingType {
  def error(message: String): Nothing = {
    throw new RuntimeException(message)
  }
  def main(args: Array[String]): Unit = {
    error("hello")
  }
}
