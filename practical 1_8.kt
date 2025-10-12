fun main(){
   println("Create Array-1 by using arrayOf() method : ")
   val array1 = arrayOf(10,90,60,80,100)
   println(array1.contentToString())


   println("Create Array-2 by using Array<>() method : ")
   val array2 = Array<Int>(5){0}
   println(array2.contentToString())


   println("Create Array-3 by using Array<>() and lambda function : ")
   val array3 = Array<Int>(8){i->i}
   println(array3.contentToString())


   println("Create Array-4 by using IntArray() method : ")
   val array4 = IntArray(5)
   println(array4.joinToString())


   println("\nCreate Array-5 by using intArrayOf() method : ")
   val array5 = intArrayOf(12,10,1,5,18,19)
   println(array5.joinToString())


   println("\nCreate 2D Array-6 by using arrayOf() and intArrayOf method : ")
   val array6 = arrayOf(
       intArrayOf(1,3),
       intArrayOf(4,5),
       intArrayOf(6,7),
   )
   println(array6.contentDeepToString())


   println("Please enter Array Value:")
   val array7 = IntArray(5)
   for(i in 0..(array7.size-1)){
       print("a[$i] = ")
       array7[i] = readln().toInt()
   }
   println("Entered Array:")
   println(array7.contentToString())


   println("***************With Built-in Function***************")
   println("After sorting by built=in function : ")
   val array8 = array7.sorted()
   println(array8.joinToString())


   println("\n***************Without Built-in Function***************")
   println("Before Sorting :\n${array7.joinToString()}")


   //Bubble Sorting
   val array9 = array7.copyOf()
   for(i in array9.indices){
       for(j in 0 until (array9.size-i-1)){
           if(array9[j] > array9[j+1]){
               val temp = array9[j]
               array9[j] = array9[j+1]
               array9[j+1] = temp
           }
       }
   }
   print("\nAfter Sorting without built-in Function:\n${array9.joinToString()}")
}
