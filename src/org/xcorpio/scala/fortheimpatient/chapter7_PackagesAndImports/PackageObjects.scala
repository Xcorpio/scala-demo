package org.xcorpio.scala.fortheimpatient.chapter7_PackagesAndImports

package object people {
  val defaultName = "mr.zheng"
  def sayHi() { // procedure return Unit
    println("hi.")
  }
}

package people {
  class Person {
    var name = defaultName // a constant from the package
    sayHi()
  }
}

object PackageObjects {
  def main(args: Array[String]): Unit = {
    val p = new people.Person
    people.sayHi()
    _root_.org.xcorpio.scala.fortheimpatient.chapter7_PackagesAndImports.people.sayHi()
  }
}