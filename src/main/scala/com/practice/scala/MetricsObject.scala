package com.practice.scala

object MetricsObject {
    
  def main(args:Array[String]){
        val metricsType:String = "GATLING"
        
        metricsType match {
          case GATLING.parameter => println("GATLING")
          case CPU.parameter => println("CPU")
        }
  }
}