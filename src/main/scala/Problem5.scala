/**
  * Created by dragonaxe on 8/26/16.
  */
object Problem5 extends App {

  val myList = List('d', 'r', 'a', 'g', 'o', 'n', 'a', 'x', 'e')
  val myListEmpty = Nil

  /** Reverses the order of a list. */
  def reverseList[A](list: List[A]): List[A] = {
    def loop(list: List[A], base: List[A]): List[A] = list match {
      case Nil => base
      case _ => loop(list.tail, list.head :: base)
    }
    loop(list, Nil)
  }

  println(myList.reverse)
  println(reverseList(myList))

  println()

  println(myListEmpty.reverse)
  println(reverseList(myListEmpty))

}
