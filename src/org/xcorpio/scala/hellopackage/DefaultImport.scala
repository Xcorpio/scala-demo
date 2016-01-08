package org.xcorpio.scala
package hellopackage

import scala.util.Either

class DefaultImport {
  import java.lang._    // everything in the java.lang package
  import scala._        // everything in the scala package
  import Predef._       // everything in the Predef object
}

object DefaultImport {
  def main(args: Array[String]): Unit = {
    val stringBuilder = new StringBuilder
  }
}