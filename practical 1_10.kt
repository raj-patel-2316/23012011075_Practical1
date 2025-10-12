class Car(
   val type : String,
   val model : Int,
   val price : Double,
   val owner : String,
   val milesdriven : Double
   )
{
   var currentPrice : Double = price
   init{
       println("Object of class is created and Init is called.")
   }


   fun getOriginalPrice() : Double{
       return price
   }


   fun calCurrentPrice() : Double{
       currentPrice = price - milesdriven
       return currentPrice
   }
   fun displayCarInfo(){
       println("---------")
       println("Car Information : $type, $model")
       println("Car Owner : $owner")
       println("Miles Driven : $milesdriven")
       println("Original Car Price : ${getOriginalPrice()}")
       println("Current Car Price : ${calCurrentPrice()}")
       println("---------")
   }
}


fun main(){
   println("Creating Car Class Object car1 in next line")
   val car1 = Car("BMW", 2018, 100000.0, "Aman", 105.0)
   car1.displayCarInfo()


   println("\nCreating Car Class Object car2 in next line")
   val car2 = Car("BMW", 2019, 400000.0, "Karan", 20.0)
   car2.displayCarInfo()


   println("\n******* ArrayList of Car ***********")
   val cars = arrayListOf(
       Car("Toyota", 2017, 1080000.0, "KJS", 100.0),
       Car("Maruti", 2020, 4000000.0, "NPP", 200.0)
   )


   for (c in cars) {
       c.displayCarInfo()
   }
}
