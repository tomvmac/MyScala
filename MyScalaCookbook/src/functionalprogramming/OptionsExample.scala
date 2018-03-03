package functionalprogramming

object OptionsExample extends App {
  
  // Options provide type safety and error handling
  PrintUtils.printHeader("Option for fraction function")
  println("fraction(22, 7) = " + fraction(22, 7))  
  println("fraction(22, 0) = " + fraction(22, 0))  
  
  // getOrElse handles the None situation like catch in Java
  val pi = fraction(22, 0) getOrElse "Oops, something went wrong"
  println("pi " + pi)
  
  // Pattern matching with Options
  PrintUtils.printHeader("Pattern matching with Options")
  val pi2 = fraction(22, 0) match {
    case Some(pi) => pi
    case None => "Something bad happened"
  }
  println("pi2 " + pi2)
  
  
  // Handling util.Try to handle exception
  PrintUtils.printHeader("Handling util.Try to handle exception")
  val stateCodes = Map("California" -> "CA", "New York" -> "NY", "Vermont" -> "VT")
  val stateCode = util.Try(stateCodes("NoSuchState"))
  val stateCodeResult = stateCode match {
    case util.Success(code) => code
    case util.Failure(error) => "something terrible happened"
  }
  println("stateCodeResult = " + stateCodeResult)
  
  
  def fraction(numer:Double, denom: Double): Option[Double] = {
    if (denom == 0)
      None
    else
      Option(numer/denom)
      
    
  }

  
  

}