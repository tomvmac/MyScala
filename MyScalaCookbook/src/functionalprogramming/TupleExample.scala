package functionalprogramming

object TupleExample extends App {

  var stat1= ("Kobe", "Bryant", "Lakers", 24, 81, 20, 11)
  var stat2 = ("Michael", "Jordan", "Bulls", 23, 60, 22, 11)
  var stat3 = ("Lebron", "James", "Cavaliers", 23, 50, 25, 18)

  // Iterating through a tuple, since tuple is not a collection
  println("Iterating through tuple values")
  stat1.productIterator.foreach(i => println("Value = " + i))
  
  
  
  // Getting the length of the tuple
  println("--------------------------------------------------------------------------------------------------------------")
  println("Getting the length of the tuple")
  println(stat1.productArity)
  
  
  
  // Adding tuples to a list
  println("--------------------------------------------------------------------------------------------------------------")
  println("Adding tuples to a list")
  val rawstats = List (stat1, stat2, stat3)
  rawstats.foreach(println)
  
  //val highscore = rawstats.max(_._5)
  println("--------------------------------------------------------------------------------------------------------------")
  println("map function on a list of tuples")
  val doubleScore = rawstats.map(_._5 * 2)
  doubleScore.foreach(println)
  
  
  
 
 /*------------------------------------------------------------------------------------------------------------*/
 
 // two value tuple acts like a map
  val genderPair = "Tom" -> "Male"
  
  
  
  
}