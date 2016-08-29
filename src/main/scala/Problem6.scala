import scala.util.Try

/**
  * Created by dragonaxe on 8/26/16.
  */
object Problem6 extends App {

  val myList = List("dragonaxe".toList, "marmalamram".toList, "lappal".toList, Nil)

  def isPalindrome(list: List[Any]): Boolean = {
    val lowerHalf = (list.length / 2.0).floor.toInt
    val upperHalf = (list.length / 2.0).ceil.toInt
    def reverseHalf(n: Int, list: List[Any], base: List[Any]): (List[Any], List[Any]) = list match {
      case Nil => (base, list)
      case _ =>
        if (n > 0) {
          reverseHalf(n - 1, list.tail, list.head :: base)
        } else {
          (base, list)
        }
    }
    val (rev, after) = reverseHalf(lowerHalf, list, Nil)
    val rhs = if (upperHalf - lowerHalf > 0) after.tail else after
    rev == rhs
  }

  myList.foreach(list => {
    print(list + " isPal ")
    println(Try(isPalindrome(list)))
  })

}
