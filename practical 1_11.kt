class Matrix(val data: Array<IntArray>) {


   val rows = data.size
   val cols = data[0].size


   operator fun plus(other: Matrix): Matrix {
       val result = Array(rows) { IntArray(cols) }
       for (i in 0 until rows)
           for (j in 0 until cols)
               result[i][j] = data[i][j] + other.data[i][j]
       return Matrix(result)
   }


   operator fun minus(other: Matrix): Matrix {
       val result = Array(rows) { IntArray(cols) }
       for (i in 0 until rows)
           for (j in 0 until cols)
               result[i][j] = data[i][j] - other.data[i][j]
       return Matrix(result)
   }


   operator fun times(other: Matrix): Matrix {
       val result = Array(rows) { IntArray(other.cols) }
       for (i in 0 until rows)
           for (j in 0 until other.cols)
               for (k in 0 until cols)
                   result[i][j] += data[i][k] * other.data[k][j]
       return Matrix(result)
   }


   override fun toString(): String {
       return data.joinToString("\n") { it.joinToString(" ") }
   }
}


fun main() {
   val m1 = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4))) 
   val m2 = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)))
   val m3 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4))) 


   println("Addition:\n${m3 + m2}")
   println("\nSubtraction:\n${m3 - m2}")
   println("\nMultiplication:\n${m1 * m2}")
}
