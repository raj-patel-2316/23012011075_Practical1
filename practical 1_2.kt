fun main(){
   val intvalue : Int = 10
   println("Integer Value: $intvalue")
   val doublevalue : Double = intvalue.toDouble()
   println("Double Value (From Integer): $doublevalue")
   val stringvalue : String = "10"
   println("String Value : $stringvalue")
   val intvalue1 : Int = stringvalue.toInt()
   println("Integer Value 1 (From String) : $intvalue1")
   val intvalue2 : Int = stringvalue.toInt()
   println("Integer Value 2 (From String) : $intvalue2")
   val doublevalue1 : Double = stringvalue.toDouble()
   println("Double Value (From String) : $doublevalue1")
}
