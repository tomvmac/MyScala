package functionalprogramming

object FunctionalExample2 extends App {

  println("Executing FunctionalExample2 object")

//  var sayHello = saySomething("Hi") // Hi is a constructor param
//  println(sayHello("Tom"))

  val hello = greeting("spanish")
  println(hello("Tom"))
  
  
  /* Methods --------------------------------------------------------------------------------------------------------------------------- */

  // function returning a function
  def saySomething(prefix: String) = (s: String) => {
    prefix + " " + s
  }

  def greeting(language: String) = (name: String) => {
    language match {
      case "english" => "Hello, " + name
      case "spanish" => "Buenos dias, " + name
    }
  }
  
  
  
}