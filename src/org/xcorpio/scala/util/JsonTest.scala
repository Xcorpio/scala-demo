package org.xcorpio.scala.util

import scala.util.parsing.json.JSON

object JsonTest {
  def main(args: Array[String]): Unit = {
    val text = "{\"logintype\":\"WEB001\",\"method\":\"applycreditbl1\",\"methodbody\":{\"applyamount\":\"10000\",\"finalcredit\": 100000,\"bankcard\":\"4096675282007589873\",\"bid\":4091297047897345024,\"flashid\":\"110\",\"ip\":\"45.192.212.95\",\"isstudent\":\"false\",\"name\":\"鲁明说\",\"phonenumber\":\"14241847887\",\"prcid\":\"610724197301010208\",\"projectid\":\"QUNAR001\",\"tid\":\"123456\"},\"productid\":\"QNR001\",\"sourcetype\":\"QN001\",\"reqid\":\"201602051014026162575241\"}"
    val b = JSON.parseFull(text)
    b match {
      case Some(map: Map[String, Any]) => println(map.get("reqid"))
      case None => println("Parsing failed")
      case other => println("Unknown data structure: " + other)
    }
  }
}