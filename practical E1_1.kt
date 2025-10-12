fun main() {
   var a = 10
   var b = 20


   println("With using Third Variable:")
   println("Before Swapping:")
   println("The value of a is:$a and Value of b is:$b")


   val temp = a
   a = b
   b = temp


   println("After swapping")
   println("The value of a is:$a and Value of b is:$b")


   println("***********************")


   a = 10
   b = 20


   println("Without using Third Variable:")
   println("Before swapping")
   println("The value of a is:$a and b is $b")


   a = a + b
   b = a - b
   a = a - b


   println("After swapping")
   println("The value of a is:$a and b is $b")
}
