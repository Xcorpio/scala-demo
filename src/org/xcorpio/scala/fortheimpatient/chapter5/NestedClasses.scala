package org.xcorpio.scala.fortheimpatient.chapter5

import scala.collection.mutable.ArrayBuffer

class Network {
  class Member(val name: String) {
    val contacts  = new ArrayBuffer[Member]
  }
  
  private val members = new ArrayBuffer[Network#Member]  // type projection which means "a Member of any Network"
  
  def join(name: String) = {
    val m = new Member("Tom")
    members += m
    m
  }
}
object NestedClasses {
  def main(args: Array[String]): Unit = {
    
  }
}