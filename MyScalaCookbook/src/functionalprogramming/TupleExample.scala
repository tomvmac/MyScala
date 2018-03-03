package functionalprogramming

object TupleExample extends App {

  var stat1= ("Kobe", "Bryant", "Lakers", 24, 81, 20, 11)
  var stat2 = ("Michael", "Jordan", "Bulls", 23, 60, 22, 11)
  var stat3 = ("Lebron", "James", "Cavaliers", 23, 50, 25, 18)

  
  val rawstats = List (stat1, stat2, stat3)
  rawstats.foreach(println)
  
  //val highscore = rawstats.max(_._5)
  val doubleScore = rawstats.map(_._5 * 2)
  doubleScore.foreach(println)
 
  
}