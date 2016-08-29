import scala.util.Try

/**
  * Created by dragonaxe on 8/26/16.
  */
object Problem10 extends App {

  val myList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  def rle(list: List[Any]): List[(Int, Any)] = {
    val packed = Problem9.pack(myList)
    packed.map(l => (l.length, l.head))
  }

  println(Try(rle(myList)))

}
