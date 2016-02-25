package com.practice.scala

sealed abstract class Metrics(val parameter:String)

case object GATLING extends Metrics("GATLING")

case object CPU extends Metrics("CPU")

case object RAM extends Metrics("RAM")




