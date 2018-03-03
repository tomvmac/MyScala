package functionalprogramming

object ListExample extends App {
  
  // Constructing a list, impliciting using the apply method in the background
  val weekDays = List("Mon", "Tue", "Wed", "Thur", "Fri")
  PrintUtils.printHeader("Creating a list")
  weekDays.foreach(i => print(i + " "))
  
  // Combining two lists
  PrintUtils.printHeader("Combining two lists")
  val weekendDays = List("Sat", "Sun")
  
  val allDaysOfWeek = List(weekDays, weekendDays).flatten
  allDaysOfWeek.foreach(i => print(i + " " ))
  
  // List of Tuples
  PrintUtils.printHeader("Combining two lists into a tuple")
  val numDays = List (1, 2, 3, 4, 5, 6, 7)
  val allDaysOfWeekZipped = numDays zip allDaysOfWeek
  allDaysOfWeekZipped.foreach(i => print(i + " " ))
  
  
  PrintUtils.printHeader("Common list operations")
  // head and tail to get first and last element of list
  println("1st element of weekDays is " + weekDays.head)
  println("last element of weekDays is " + weekDays.tail)
  println("size of weekDays is " + weekDays.size)
  // contains
  println("weekDays contains Sun " + weekDays.contains("Sun"))
  
  // startsWith and endsWith
  val allDaysOfWeekStartWithWeekDays = allDaysOfWeek startsWith(weekDays)
  val allDaysOfWeekEndsWithWeekEnds = allDaysOfWeek endsWith(weekendDays)
  
  println("allDaysOfWeek starts with weekDays " + allDaysOfWeekStartWithWeekDays)
  println("allDaysOfWeek ends with weekDays " + allDaysOfWeekEndsWithWeekEnds)
  
  

  
  
}