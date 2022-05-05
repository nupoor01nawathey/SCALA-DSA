package scripts.DSA

object Problem2 extends App{

 // Write a function which takes an array and prints the majority element (if it exists),otherwise prints “No Majority Element”. 
 // A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 
  def findMajorityElement(array: Array[Int]): Unit = {
    val uniqVals = array.toSet
    val majorityVal = (array.length / 2.0)
    var countEachElemnt = 0.0
    var foundElement = 0
    for (i <- uniqVals) {
      for (j <- 0 to array.length-1) {
        if (i == array(j)) {
          countEachElemnt = countEachElemnt + 1
          foundElement = i
        }
      }
      if (countEachElemnt > majorityVal) {
        println("Majority Element found " + countEachElemnt + "--" + foundElement + "--" + majorityVal)
        countEachElemnt = 0.0 // reset counter irrespective of found not found dont want counter to increase in any case
      }
      else {
        println("Majority Element not found")
        countEachElemnt = 0.0 // reset counter irrespective of found not found dont want counter to increase in any case
      }
    }
  }


  val input = Array(3, 3, 4, 2, 4, 4, 2, 4, 4)
  //val input = Array(3, 3, 4, 2, 4, 4, 2, 4)
  findMajorityElement(input)
}



/*
Time Complexity: O(n^2)
Auxiliary Space: O(1).
As no extra space is required for any operation so the space complexity is constant.
*/
