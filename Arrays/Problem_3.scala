package scripts.DSA

object Problem3 extends App {

  // Find the number occuring odd number of times
  def countOddCountForArrayElement(array: Array[Int]): Unit = {
    val uniqVals = array.toSet
    var countEachElemnt = 0
    var foundElement = 0
    for (i <- uniqVals) {
      for (j <- 0 to array.length-1) {
        if (i == array(j)) {
          countEachElemnt = countEachElemnt + 1
          foundElement = i
        }
      }
      if (countEachElemnt%2 != 0) {
        println("Found number occuring odd number of times " + countEachElemnt + " -- " + foundElement)
        countEachElemnt = 0
      }
      else {
        //println("Not found")
        countEachElemnt = 0
      }
    }
  }


  val input = Array(1, 2, 3, 2, 3, 1, 3)
  //val input = Array(5, 7, 2, 7, 5, 2, 5)
  countOddCountForArrayElement(input)

}


/*
Time Complexity: O(n^2)
Auxiliary Space: O(1).
As no extra space is required for any operation so the space complexity is constant.
*/
