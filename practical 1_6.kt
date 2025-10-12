fun main(){
   print("Enter First Number : ")
   val num1 = readln().toInt()
   print("Enter Second Number : ")
   val num2 = readln().toInt()
   print("Enter Third Number : ")
   val num3 = readln().toInt()
   println("$num1 + $num2 + $num3= ${calculation(num1,num2,num3,"+")}")
   println("$num1 - $num2 - $num3= ${calculation(num1,num2,num3,"-")}")
   println("$num1 * $num2 * $num3= ${calculation(num1,num2,num3,"*")}")
   println("$num1 / $num2 / $num3= ${calculation(num1,num2,num3,"/")}")
}


fun calculation(num1: Int, num2: Int, num3: Int, choice:String): Int {
   return when(choice) {
       "+" -> num1 + num2 + num3
       "-" -> num1 - num2 - num3
       "*" -> num1 * num2 * num3
       "/" -> if(num2 == 0 || num3 == 0){
                   println("Divide by zero is not possible")
                   return 0
              }
              else{num1/num2/num3}
       else -> {
           println("Enter Valid Operation")
           return 0
       }
   }
}
