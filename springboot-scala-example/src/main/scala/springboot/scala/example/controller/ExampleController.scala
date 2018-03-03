package springboot.scala.example.controller

import java.time.LocalDateTime

import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class ExampleController {

  @RequestMapping(path = Array("/"), method = Array(GET))
  def example(): Map[String, Any] = {
    Map("message" -> "Scala rocks for Tom!", "today" -> LocalDateTime.now().toString)
  }

  @RequestMapping(path = Array("/hello"), method = Array(GET))
  def sayHello(): String = {
    "Hello World from hhhh!"
  }

  @RequestMapping(path = Array("/tupleDoubleScore"), method = Array(GET))
  def getTupleDoubleScore(): Any = {
    var stat1= ("Kobe", "Bryant", "Lakers", 24, 81, 20, 11)
    var stat2 = ("Michael", "Jordan", "Bulls", 23, 60, 22, 11)
    var stat3 = ("Lebron", "James", "Cavaliers", 23, 50, 25, 18)

    val rawStats = List(stat1, stat2, stat3)
    val doubleScore = rawStats.map(_._5 * 2)

    val favPlayer = rawStats.map(_._1 + " James ")
    favPlayer

  }

}
