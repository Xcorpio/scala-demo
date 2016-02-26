package org.xcorpio.scala.fortheimpatient.chapter10_Traits

trait TConsoleLogger {
  def log(msg: String) { println(msg) }
}

class TT extends TConsoleLogger {
  def withTT() {
    log("TT")
  }
}

object TraitsWithConcreteImplementations {
  def main(args: Array[String]): Unit = {
    val tt = new TT
    tt.withTT()
  }
}