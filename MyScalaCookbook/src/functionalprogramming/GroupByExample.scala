package functionalprogramming

object GroupByExample extends App {
  
  // Create a Car class
  case class Car(val carMake: String, val carModel: String, val carType : String, price: Double, country: String)

  var carList = List(Car("BMW", "330", "Sedan", 40000, "Germany"), Car("BMW", "500", "Sedan", 80000, "Germany"), Car("Porsche", "911", "Sports", 40000, "Germany"), Car("Ferrari", "460", "Sports", 400000, "Italy"), Car("Fiero", "Tesa", "Sports", 2000, "US"))
  var cheaperCarList = List(Car("Toyota", "Camry", "Sedan", 32000, "Japan"), Car("Hyundai", "Sonata", "Sedan", 28000, "Korea"), Car("Toyota", "Corolla", "Sedan", 28000, "Japan"))
  var usedCarList = List(Car("Toyota", "Camry", "Sedan", 10000, "Japan"), Car("Honda", "Civic", "Sedan", 14000, "Japan"), Car("Toyota", "Corolla", "Sedan", 8000, "Japan"))
  
  // merging list using union
  carList = carList.union(cheaperCarList).union(usedCarList)
   
  PrintUtils.printHeader("Initial List of cars")
  carList.foreach(println)
  
  // GroupBy carType
  PrintUtils.printHeader("Cars grouped by carType")
  val carListGroupByType = carList.groupBy(_.carType)
  carListGroupByType.foreach(println)
  
  // Transform List of List back to List of Cars
  PrintUtils.printHeader("List of Sports Cars")
  val sportsCars = carListGroupByType.get("Sports").toList.flatten
  sportsCars.foreach(println)
  
  // Perform sortBy and get last element for highest price
  val highestPricedSportsCars = sportsCars.sortBy(x => x.price).last
  println("highest priced sports car is " + highestPricedSportsCars)
  
  val cheapestSportsCars = sportsCars.sortBy(x => - x.price).last
  println("cheapestSportsCars priced sports car is " + cheapestSportsCars)
  
  // Average Cost of a Japanese Sedan
  PrintUtils.printHeader("Average Cost of a Japanese Sedan")
  val japaneseSedans = carList.filter(_.carType == "Sedan").filter(_.country == "Japan")
  japaneseSedans.foreach(println)
  
  println("")
  
  // Sum of prices in a given list of objects
  val totalPriceOfJapaneseSedans = japaneseSedans.view.map(_.price).sum
  println("totalPriceOfJapaneseSedans " + totalPriceOfJapaneseSedans)
  
  val avgPriceOfJapaneseSedans = totalPriceOfJapaneseSedans / japaneseSedans.length
  println("avgPriceOfJapaneseSedans is " + avgPriceOfJapaneseSedans)
  
}