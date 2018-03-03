package functionalprogramming

object FunctionalExample1 extends App {
  
  println("Executing FunctionalExample1 object")
  
  // print Evens
  //printEvens()
  
  // double is function literal producing a double of a given input
  var double = (i: Int) => { i * 2}
  println("Double of 2 is " + double(2))
  
  var isEven = (i: Int) => {i % 2 == 0}
  println("8 is even is " + isEven(8))
  
  // print Doubles
  //printDoubles()
  
  // passing a function to another function to execute
//  val sayHello = () => { println("Hello") }
//  executeFunction(sayHello)

  // add function
//  var addNums = add(2,7)
//  println("2 + 7 = " + addNums)
  //println("2 + 7 = " + addNums(2, 7))
  
  //println(add(2, 9))
  val sum = (a: Int, b: Int) => a + b
  println("5 + 5 is " + sum(5,5))
  
  
  // -------------------------------------------------------------------------------------------------------------------------
  // Methods

  // Print Evens with Filter
  def printEvens() {
    println("Executing printEvens method")
     // filter evens
    var x = List.range(1, 11)
    var evens = x.filter(_ % 2 == 0)
    
    println("Original List")
    x.foreach(println)
    
    println("Even List")
    evens.foreach(println)
  }
  
  def printDoubles() {
    println("Executing printDoubles method")
    var x = List.range(1, 11)
    var doubles = x.map(double)
    doubles.foreach(println)
  }
  
  def executeFunction(callback:() => Unit) {
    callback()
  }
  
  def addNums(a: Int, b: Int){
    a + b
  }
  

  
}