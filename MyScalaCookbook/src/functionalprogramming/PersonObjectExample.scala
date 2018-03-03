package functionalprogramming

object PersonObjectExample extends App {

  // Create a Person class
  case class Person(val name: String, val age: Int)

  // Add objects to list
  val playerList = List(Person("Magic", 60), Person("Bird", 60), Person("Kobe", 36), Person("Lebron", 28))
  val mvpPlayerList = List(Person("Chamberlan", 60), Person("Kobe", 36), Person("Lebron", 28))

  // Filter & Sort
  PrintUtils.printHeader("Filter & Sort - Players Over 35")
  val playersOver35 = playerList.filter(x => x.age > 35).sortBy(x => x.age)
  playersOver35.foreach(println)

  // Get Last element
  PrintUtils.printHeader("Get Last Element - Oldest Player")
  val oldestPlayer = playerList.sortBy(x => x.age).last
  println(oldestPlayer)

  // Get 60 yr old players
  PrintUtils.printHeader("Partition - 60 Yr Old Players")
  val sixtyYrOldPlayers = playerList.partition(x => x.age == 60)._1   //.map(x => x.name + " is an old fart")
  sixtyYrOldPlayers.foreach(println)

  // Get 60 yr old players who are also in mvp list - Intersect, Union
  PrintUtils.printHeader("Intersect - 60 yr old mvps")
  val sixtyYrOldMvps = sixtyYrOldPlayers.intersect(mvpPlayerList)
  sixtyYrOldMvps.foreach(println)
  
  // Merge two lists
  PrintUtils.printHeader("Merge two lists - mvps + players")
  val allPlayers = playerList.union(mvpPlayerList).distinct
  allPlayers.foreach(println)
  
  // Get Avg Age of players
  PrintUtils.printHeader("Avg Age of Players")
  var sumOfPlayerAges = 0
  playerList.foreach(x => sumOfPlayerAges += x.age)
  var avgPlayerAge = sumOfPlayerAges / playerList.length
  println("Avg age of players is " + avgPlayerAge)

}