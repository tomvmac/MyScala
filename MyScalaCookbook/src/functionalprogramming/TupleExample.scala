package functionalprogramming

object TupleExample extends App {

  var stat1 = ("Kobe", "Bryant", "Lakers", 24, 81, 20, 11)
  var stat2 = ("Michael", "Jordan", "Bulls", 23, 60, 22, 11)
  var stat3 = ("Lebron", "James", "Cavaliers", 23, 50, 25, 18)

  // Iterating through a tuple, since tuple is not a collection
  println("Iterating through tuple values")
  stat1.productIterator.foreach(i => println("Value = " + i))

  // Getting the length of the tuple
  PrintUtils.printHeader("Getting the length of the tuple")
  println("Getting the length of the tuple")
  println(stat1.productArity)

  // Adding tuples to a list
  PrintUtils.printHeader("Adding tuples to a list")
  val rawstats = List(stat1, stat2, stat3)
  rawstats.foreach(println)

  //val highscore = rawstats.max(_._5)
  PrintUtils.printHeader("map function on a list of tuples")
  val doubleScore = rawstats.map(_._5 * 2)
  doubleScore.foreach(println)

  // Avg Tuple
  PrintUtils.printHeader("Avg Tuple")
  var carAvgTuple1 = ("Minivan", 40000.55)
  var carAvgTuple2 = ("Sports", 2040000.77)
  var carAvgTuple3 = ("Sedan", 20000.44)

  val carAvgList = List(carAvgTuple1, carAvgTuple2, carAvgTuple3)
  carAvgList.foreach(println)

  val highestAvgCarType = carAvgList.sortBy(_._2).last
  PrintUtils.printHeader("Highest Avg Car Type")
  println(highestAvgCarType)

  /*------------------------------------------------------------------------------------------------------------*/

  // two value tuple acts like a map
  val genderPair = "Tom" -> "Male"

}