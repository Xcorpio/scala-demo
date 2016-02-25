package org.xcorpio.scala.fortheimpatient.chapter8_Inheritance

abstract class Person(val name: String) {
  def id: Int // no method body - this is an abstract method
  val vid: Int // No initializer--this is an abstract field with an abstract getter method
  var vname: String // Another abstract field,with abstract getter and setter methods
}

class Employee(name: String) extends Person(name) {
  def id = name.hashCode // 'override' keyword not required
  val vid = 1
  var vname = ""
}

class Person2(name: String) {
  override def toString = name
}

object AbstractField {

  def main(args: Array[String]): Unit = {
    val p2 = new Person2("Tom")
    println(p2)
  }
}