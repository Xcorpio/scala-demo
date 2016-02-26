package org.xcorpio.scala.fortheimpatient.chapter10_Traits

trait shortLogger extends Logger {
  val maxLength = 15 // a concrete field
  val abstractMaxLength: Int // a abstract field
}
object ConcreteFieldsInTraits {

  def main(args: Array[String]): Unit = {
  }
}