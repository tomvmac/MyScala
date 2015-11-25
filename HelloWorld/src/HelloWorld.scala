/**
 * Created by tmac on 11/23/2015.
 */
object HelloWorld {
  def main(args: Array[String]) = {
    var myName = "Tom"
    println(sayHello(myName))
  }


  def sayHello(myName: String) = "Hello " + myName


}