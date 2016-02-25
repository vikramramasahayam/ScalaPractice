package com.coldlight.systemok.tests

object Test1 {
  
  def main(args:Array[String]){
  val one= Numbers.ONE
  
  val number =Numbers.withName("1")  
  
  number match {
    case Numbers.ONE => println("")
    case _ => println("")
  }
  
  } 
}

object Numbers extends Enumeration{
  val ONE = Value("1")
  val TWO = Value("2")
  val THREE = Value("3")
}