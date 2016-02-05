package org.xcorpio.scala.util

object RegTest {
  def main(args: Array[String]): Unit = {
    val data = "{\"logintype\":\"WEB001\",\"method\":\"applycreditbl1\",\"methodbody\":{\"applyamount\":\"10000\",\"bankcard\":\"6221511804228334249\",\"bid\":1838600991063269376,\"flashid\":\"110\",\"ip\":\"38.126.18.254\",\"isstudent\":\"false\",\"name\":\"甄成年\",\"phonenumber\":\"13156580388\",\"prcid\":\"15252219941120283X\",\"projectid\":\"NUOMI01\"},\"productid\":\"DLQ001\",\"sourcetype\":\"ZCP001\",\"reqid\":\"201602051014024670339796\"}"
    val reg = """"reqid":"([0-9]*)"""".r
    val s = reg.findFirstMatchIn(data).get.toString
    println(s.substring(9,s.length()-1))
  }
}