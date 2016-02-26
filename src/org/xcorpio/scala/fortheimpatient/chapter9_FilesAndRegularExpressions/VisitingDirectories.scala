package org.xcorpio.scala.fortheimpatient.chapter9_FilesAndRegularExpressions

import java.io.File

object VisitingDirectories {
  def main(args: Array[String]): Unit = {
    val dirs = subdirs(new File("."))
    for (dir <- dirs) println(dir)
  }

  def subdirs(dir: File): Iterator[File] = {
    val child = dir.listFiles()
    // println(child.mkString(" "))
    val children = child.filter(_.isDirectory)
    // println(children.mkString(" "))

    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }
}