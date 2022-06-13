package service

case class A(id: Int)
case class B(id: String, ich: List[String])

case class Schedule()

object Schedule {
  def fillA(): List[A] = {
    val a = List.tabulate(10)(n => n + 1)
    a.map(A(_))
  }

  def fillB: List[B] = {
    val a = List.tabulate(10)(n => n + 1)
    a.map(v => B(s"id$v", List(s"ich$v")))
  }
}
