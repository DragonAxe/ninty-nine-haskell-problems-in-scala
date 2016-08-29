import scala.util.Try

/**
  * Created by dragonaxe on 8/26/16.
  */
object Problem2 extends App {

  val myList1 = List('d', 'r', 'a', 'g', 'o', 'n', 'a', 'x', 'e')
  val myList2 = List('d')
  val myList3 = List()

  /** Gets the second to last element of a list. */
  def getLastButOne[A](list: List[A]): A = list match {
    case Nil => throw new NoSuchElementException("The list is empty.")
    case a :: Nil => throw new NoSuchElementException("The list only has one element.")
    case a :: b :: Nil => a
    case lst: List[A] => getLastButOne(lst.tail)
  }

  /** Gets the second to last element of a list with more generic error handling. */
  def getLastButOneV2[A](list: List[A]): A = list match {
    case a :: b :: Nil => a
    case _ :: _ :: lst => getLastButOne(lst)
    case _ => throw new NoSuchElementException("The does not have a last but one element.")
  }

  println(Try(getLastButOne(myList1)))
  println(Try(getLastButOne(myList2)))
  println(Try(getLastButOne(myList3)))

  println()

  println(Try(getLastButOneV2(myList1)))
  println(Try(getLastButOneV2(myList2)))
  println(Try(getLastButOneV2(myList3)))

}
