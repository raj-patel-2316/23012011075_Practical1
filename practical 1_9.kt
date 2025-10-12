fun main(){
   print("Enter Number of Elements : ")
   val n = readln().toInt()
   val arr = IntArray(n)
   println("Enter Elements:")
   for (i in 0..n-1){
       arr[i]= readln().toInt()
   }
   var max = arr[0]
   for(i in 1..n-1){
       if(arr[i]>max) max = arr[i]
   }
   print("Maximum Number is : $max")
}
