package com.practice.scala

object Test {
  
  def main(args:Array[String]){
     
//    val name:String = "Vikram"
//    println(s" My name is $name")
    
//    val name:String="Vikram"
//    println(raw"""My name is "" $name""") // raw allows special characters
    
//    var numbers:List[Int] = List(1,2,3,4)
//    
//    println(s" Numbers are : $numbers")
    
//    numbers = List(4,9,10,8)
//    
//  var n = Nil
//  for(n <- numbers){
//    println(n)
//  }
//    
//    println("-------")
//    numbers.foreach { x => println(x) }
//    
//    val row = (12,"Vikram")
//    println(row._2) // way to access Tuple
//    
//    val(rollno,username,marks) = getUserInfo
//    
//    println(s"Username is : $username , with marks : $marks")
    
//    val student1 = (11,"Anitha")
//    val student2 = (12,"Vikram")
//    val student3 = (9,"Rajitha")
//    
//    studentInfo(student3)
    
//    val map = Map(1->"one",2->"two")
    
//    println(map.get(3).getOrElse("Three"))
    
//    patternMatching(2)
    
    var numbers:List[Int] = List(1,2,3,4)
    
   println(numbers.zip(List("one","two","three","four")))
    
  }
  
 
  
  def patternMatching(n:Int){
    val map = Map(1->4,2->6)
    
    map.get(n) match {
      case Some(n) => println(n*2)
      case None => println("Nothing")
    }
    
  }
  def studentInfo(student:Tuple2[Int,String]){
      student match {
        case (11,"Anitha") => println("Anitha")
        case (12,"Vikram") => println("Vikram")
        case _ => println("Nothing")
      }
  }
  def getUserInfo = (11,"Anitha",100.0)
}