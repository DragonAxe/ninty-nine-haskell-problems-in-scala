import scala.util.Try

/**
  * Created by dragonaxe on 8/26/16.
  */
object Problem3 extends App {

  val myList1 = List('d', 'r', 'a', 'g', 'o', 'n', 'a', 'x', 'e')
  val myList2 = List('d', 'r', 'a')
  val myList3 = List()

  /** Returns the n'th element of the list with 1 based indexing. */
  def elementAt[A](list: List[A], n: Int): A = list match {
    case Nil => throw new IndexOutOfBoundsException("The index given is %d element beyond the end of the list.".format(n))
    case _ => if (n <= 1) list.head else elementAt(list.tail, n - 1)
  }

  println(Try(elementAt(myList1, 4)))
  println(Try(elementAt(myList2, 4)))
  println(Try(elementAt(myList3, 4)))

}
