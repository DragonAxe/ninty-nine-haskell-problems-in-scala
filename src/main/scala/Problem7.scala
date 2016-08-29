import scala.collection.GenTraversable
import scala.util.Try

/**
  * Created by dragonaxe on 8/26/16.
  */
object Problem7 extends App {

  val myList = List('a', List('b', 'c'), List(List(List('d', 'e'), 'f', 'g')), 'h')

  def flatten(list: List[Any]): List[Any] = {
    def loop(list: List[Any], base: List[Any]): List[Any] = list match {
      case (xs: List[Any]) :: _ => loop(list.tail, loop(xs, base))
      case x :: _ => loop(list.tail, x :: base)
      case Nil => base
    }
    loop(list, Nil).reverse
  }

  println(Try(flatten(myList)))

  println()

  // Scala has built in flatten function, but it only works on uniform lists. I.e. List[List[Char]]
  val simpleList = List(List('a', 'b', 'c'), List('d', 'e', 'f'))
  println(simpleList.flatten)

}
