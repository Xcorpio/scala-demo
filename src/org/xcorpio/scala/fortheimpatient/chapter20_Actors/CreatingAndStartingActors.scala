package org.xcorpio.scala.fortheimpatient.chapter20_Actors

import scala.actors.Actor


class HiActor extends Actor {
  def act(): Unit = {
    while (true) {
      receive {
        case "Hi" => println("hello")
      }
    }
  }
}
object CreatingAndStartingActors {
  def main(args: Array[String]): Unit = {
    val actor1 = new HiActor
    actor1.start()
    actor1 ! "hi"
  }
}