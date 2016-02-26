package org.xcorpio.scala.fortheimpatient.chapter9_FilesAndRegularExpressions

/**
 * you can omit the 'SerialVersionUID' annotation if you are OK with the default id
 */
@SerialVersionUID(33L) class Person(val name: String) extends Serializable

object Serialization {
  def main(args: Array[String]): Unit = {
    val p = new Person("Tom")
    println(p.name)
  }
}