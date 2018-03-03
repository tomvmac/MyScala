package functionalprogramming

object MutableCollectionExample extends App {

  PrintUtils.printHeader("Modifying List")
  
  // mutable list
  val someNumbers = collection.mutable.Buffer(10, 20, 30, 40, 50)
  val moreNumbers = collection.mutable.Buffer(60, 70)
  
  // mutable map
  val stateCodes = collection.mutable.Map("California" -> "CA", "New York" -> "NY", "Vermont" -> "VT")
  
  // list builder
  someNumbers += 55
  val listBuilder = List.newBuilder[Int]
  someNumbers.foreach(listBuilder +=_)
  moreNumbers.foreach(listBuilder +=_)
  listBuilder += 80
  
  val reconstructedList = listBuilder.result
  println("reconstructedList of immutable list")
  reconstructedList.foreach(println)
  
  PrintUtils.printHeader("Modifying Arrays")
  // Modifying Arrays
  val daysOfWeek = Array("Mon", "Tue", "Wed")
  
  println(daysOfWeek(0))
  daysOfWeek(0) = "Manic Monday"
  println(daysOfWeek(0))
  


}