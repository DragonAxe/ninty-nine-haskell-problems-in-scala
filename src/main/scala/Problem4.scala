/**
  * Created by dragonaxe on 8/26/16.
  */
object Problem4 extends App {

  val myList = List('d', 'r', 'a', 'g', 'o', 'n', 'a', 'x', 'e')
  val myListEmpty = Nil

  /** Gets the length of the given list. */
  def getLength(list: List[Any]): Long = {
    def loop(list: List[Any], n: Long): Long = list match {
      case Nil => n
      case _ => loop(list.tail, n + 1)
    }
    loop(list, 0)
  }

  println(myList.length)
  println(getLength(myList))

  println()

  println(myListEmpty.length)
  println(getLength(myListEmpty))

}
