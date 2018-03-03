package functionalprogramming


/** Higher order functions replace loops and are useful because that can be passed into other functions and chained.   **/
object HigherOrderFunctions extends App {
  
 
  PrintUtils.printHeader("Higher Order Function Examples")
  
  val weekDays = List("Mon", "Tue", "Wed", "Thur", "Fri")
  
  // Higher Order Functions that operate on one elment at a time
  
  // Foreach
  PrintUtils.printHeader("Foreach Example")
  //weekDays.foreach(print(_))  // _ is the shorthand for the current item in the loop
  weekDays.foreach(x => print(x + " "))
  
  // Map
  PrintUtils.printHeader("Map Example")
  //val mappedDays = weekDays.map(_ == "Mon") // short hand
  val mappedDays = weekDays.map(x => x == "Mon") // long version
  
  // anonymous function
  val isManicMonday = (x:String) => {
    x == "Mon": Boolean
  }
  
  // Passing a function to a map function
  //val mappedDaysFunc = weekDays.map(isManicMonday)
  
  // Passing a named function
  val mappedDaysFunc = weekDays.map(x => isThursday(x))
  
  mappedDaysFunc.foreach(x => print(x + " "))
   
  
  // Filter
  PrintUtils.printHeader("Filter Examples")
  val filteredThurDays = weekDays.filter(x => isThursday(x))
  filteredThurDays.foreach(x => print(x + " "))
    
  // Partition
  // Partition splits the orignial list into a two element tuple, a list of trues and a list of falses
  PrintUtils.printHeader("Partition Examples")
  val partitionedDays = weekDays.partition(x => isThursday(x))
  val partitionedTrues = partitionedDays._1
  val partitionedFalses = partitionedDays._2
 
  partitionedTrues.foreach(x => print(x + " "))
  println(" ")
  partitionedFalses.foreach(x => print(x + " "))
  
  // SortBy
  println("")
  weekDays.sortBy(_(0)).foreach(x => print(x + " "))
  
  
  /* -------------------------------------------------------------------------------------------------------------------------------------------- */
  
  // Higher Order Functions that operate on multiple elments at a time
  
  
  // Scan Right
   PrintUtils.printHeader("Scan Right Example")
   
  // Scan Left
  
  // Fold
  
  // Reduce
  
  
  def isThursday(x: String): Boolean = {
    x == "Thur": Boolean
      
  }
  
}