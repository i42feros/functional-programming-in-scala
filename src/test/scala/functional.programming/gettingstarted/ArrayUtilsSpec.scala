package functional.programming.gettingstarted

import org.scalatest.{Matchers, WordSpec}

/**
 * Created by sonia on 23/03/2016.
 */
class ArrayUtilsSpec extends WordSpec with Matchers {

  "ArrayUtils" should {

    "check if it is sorted" when {
      "receive a sorted array of string" in {
        def ascString(a: String, b: String): Boolean = a < b

        ArrayUtils.isSorted(Array("Hello", "World"), ascString) should be(true)
      }

      "receive a sorted array of only one string" in {
        def ascString(a: String, b: String): Boolean = a < b

        ArrayUtils.isSorted(Array("Hello"), ascString) should be(true)
      }

      "using anonymous function" in {
        ArrayUtils.isSorted(Array("Hello", "World"), (a: String, b:String) => a < b) should be(true)
      }

      "receive a unsorted array of string" in {
        ArrayUtils.isSorted(Array("Hola", "Sonia"), (a: String, b:String) => a > b) should be(false)
      }

      "receive a sorted array of integers" in {
        def ascInt(a: Int, b: Int): Boolean = a < b

        ArrayUtils.isSorted(Array(11, 22, 24), ascInt) should be(true)
      }

      "receive a unsorted array of integers" in {
        ArrayUtils.isSorted(Array(22, 33, 45), (a: Int, b:Int) => a > b) should be(false)
      }
    }

  }
}
