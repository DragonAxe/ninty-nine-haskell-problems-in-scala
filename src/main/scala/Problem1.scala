import scala.util.Try

/**
  * Created by dragonaxe on 8/26/16.
  */
object Problem1 extends App {

  val myList1 = List('d', 'r', 'a', 'g', 'o', 'n', 'a', 'x', 'e')
  val myList2 = List('d')
  val myList3 = List()

  /** Gets the last element in the list (if the list is not empty). */
  def getLast[A](list: List[A]): A = list match {
    case Nil => throw new NoSuchElementException("The list is empty.")
    case a :: Nil => a
    case lst: List[A] => getLast(lst.tail)
  }

  println(Try(getLast(myList1)))
  println(Try(getLast(myList2)))
  println(Try(getLast(myList3)))

}
