package functionalprogramming

object MapExample extends App {
  
  
  // Creating maps
  val stateCodes = Map("California" -> "CA", "New York" -> "NY", "Vermont" -> "VT")
  
  
  // Map Look up
  println("State code for Vermont is " + stateCodes("Vermont"))
  
  // Contains
  println("State Codes contains California " + stateCodes.contains("California"))
  
  
  // Higher Order Methods
  PrintUtils.printHeader("print a list of map values")
  stateCodes.foreach((p: (String, String)) => println(p._1 + "=" + p._2))
  
  
  // Conversion map from / to list
  PrintUtils.printHeader("Conversion map from / to list")
  // Convert map to list
  val states = stateCodes.keys.toList
  states.foreach(x => print (x +", "))
  println("")
  val codes = stateCodes.values.toList
  codes.foreach(x => print (x +", "))
  
  /// Convert list to map
  val stateCodes2 = (codes zip states).toMap
  stateCodes2.foreach((p: (String, String)) => println(p._1 + "=" + p._2))
  

}