package org.xcorpio.scala.fortheimpatient.chapter5

import scala.beans.BeanProperty

class Animal {
  /**
   * when you annotate a scala field with '@BeanProperty', four methods will generated
   * 1. name: String
   * 2. name_=(newValue: String)
   * 3. getName(): String
   * 4. setName(newValue: String): Unit
   */
  @BeanProperty var name: String = "animal"
}

object BeanProperties {
  def main(args: Array[String]): Unit = {
    
  }
}