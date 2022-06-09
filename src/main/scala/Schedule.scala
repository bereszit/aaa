case class Schedule()

object Schedule {
  var a: List[Int] = List.empty[Int]
  println("list initialization")
  def initializeList(multi: Int=1) = {

    a = List.range(1,100).map(_*multi)
  }
}
