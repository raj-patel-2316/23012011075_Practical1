fun main(){
   print("Enter the number : ")
   val num = readln().toInt()
   print("Factorial of $num is ${fact(num)}")
}
fun fact(numx : Int) : Int{
   if(numx==0 || numx==1) return 1
   else return numx*fact(numx-1)
}
