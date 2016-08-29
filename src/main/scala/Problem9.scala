import scala.util.Try

/**
  * Created by dragonaxe on 8/26/16.
  */
object Problem9 extends App {

  val myList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  def pack(list: List[Any]): List[List[Any]] = {
    def loop(list: List[Any], base: List[List[Any]]): List[List[Any]] = list match {
      case Nil => base
      case xs => {
        def gather(list: List[Any], base: List[Any]): (List[Any], List[Any]) = list match {
          case x :: y :: _ => if (x == y) gather(list.tail, x :: base) else (x :: base, list)
          case x :: y => if (x == y) gather(list.tail, x :: base) else (x :: base, list)
          case Nil => (base, list)
          case x => (x :: base, list)
        }
        val (gathered, nibbed) = gather(xs, Nil)
        loop(nibbed.tail, gathered :: base)
      }
    }
    loop(list, Nil).reverse
  }

  println(Try(pack(myList)))

}
