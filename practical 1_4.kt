fun main(){
   print("Enter Number : ")
   val number = readln().toInt()
   println(
       if(number%2==0) println("$number is even") else println("$number is odd")
   )
}
