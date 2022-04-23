package scripts.DSA

// Find 2 elements with given sum
object Problem1 extends App {
  def checkSum(myArray: Array[Int], expectedSum: Int): Unit = {
    for (i <- 0 to myArray.length-1) {
      for (j <- i+1 to myArray.length-1) {
        if (myArray(i)+myArray(j) == expectedSum) {
          println("found sum of two elements which equals given number => ${myArray(i)}+${myArray(j)} == ${expectedSum}")
        }
        else {
          println("not found!")
        }
      }
    }
  }

  checkSum(Array(0, -1, 2, -3, 1), -2)
}


/*
Time Complexity: O(n^2)

Auxiliary Space: O(1).
As no extra space is required for any operation so the space complexity is constant.
*/
