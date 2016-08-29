import scala.util.Try

/**
  * Created by dragonaxe on 8/26/16.
  */
object Problem8 extends App {

  val myList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  def compress(list: List[Any]): List[Any] = {
    def loop(list: List[Any], base: List[Any]): List[Any] = list match {
      case Nil => base
      case x :: Nil => x :: base
      case x :: y :: xs =>
        if (x == y) {
          loop(list.tail, base)
        } else {
          loop(list.tail, x :: base)
        }
    }
    loop(list, Nil).reverse
  }

  println(Try(compress(myList)))

}
