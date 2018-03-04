package realworldsamples

import scala.collection.mutable.ListBuffer

case class PlayerStat(firstName: String, lastName: String, position: Int, points: Int, rebounds: Int, assists: Int, conference: String, rings: Int, highestGrade: Int, height: Int, weight: Int)


object PlayerExample extends App {

  val playerStats = readPlayerStatsFromFile()
  playerStats.foreach(println)

  println("----------------------------------------------------------------------------------")

  println("Player Highlights:")

  val highScorePlayer = playerStats.reduceLeft(maxScore)
  println(s"${highScorePlayer.firstName} had the highest points: ${highScorePlayer.points}")

  println("----------------------------------------------------------------------------------")

  val doublePlayers = playerStats.filter { playerStat =>
    (playerStat.points > 10 && playerStat.rebounds > 10) ||
      (playerStat.points > 10 && playerStat.assists > 10) ||
      (playerStat.rebounds > 10 && playerStat.assists > 10)
  }

  println("Double double players:")
  doublePlayers.foreach(println)

  def readPlayerStatsFromFile(): ListBuffer[PlayerStat] = {
    println("Player Stats:")
    println("firstName | lastName | position | points | rebounds | assists: | conference | rings | highestGrade | height | weight")

    var playerStatsFromFile = new ListBuffer[PlayerStat]()

    val bufferedSource = io.Source.fromFile("C:\\projects\\MyScala\\MyScalaCookbook\\data\\PlayerStats.tsv")
    for (line <- bufferedSource.getLines.drop(1)) {
      val cols = line.split("\t").map(_.trim)
      //println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}|${cols(4)}|${cols(5)}|${cols(6)}|${cols(7)}|${cols(8)}|${cols(9)}|${cols(10)}")
      
      var playerStatFromFile = PlayerStat(cols(0), cols(1), cols(2).toInt, cols(3).toInt, cols(4).toInt, cols(5).toInt, cols(6), cols(7).toInt, cols(8).toInt, cols(9).toInt, cols(10).toInt)
      playerStatsFromFile += playerStatFromFile
        
    }
    
    bufferedSource.close
    playerStatsFromFile
  }

  def maxScore(ps1: PlayerStat, ps2: PlayerStat): PlayerStat = if (ps1.points > ps2.points) ps1 else ps2

}