package org.xcorpio.scala

package object hellopackage {
  def showFruit(fruit: Fruit) {
    import fruit._
    println(name + ":" + color)
  }
}