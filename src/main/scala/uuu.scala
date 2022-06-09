import java.time.format.DateTimeFormatter
import java.time.{Instant, LocalDateTime}
import scala.annotation.tailrec
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success, Try}
import scala.concurrent.ExecutionContext.Implicits.global
import java.sql.Timestamp


case class A(id: Int)
case class B(id: String, ich: List[String])

object  uuu  extends App {

  val a1 = Seq(("1", "1-one"), ("1", "1-two"), ("1", "1-three"), ("2", "2-one"), ("2", "2-two"), ("2", "2-three"), ("3", "3-one"), ("3", "3-two"), ("3", "3-three"))
  println(a1.groupBy(_._1).map(v=>(v._1, v._2.map(x=>x._2))).map(v=>B(v._1, v._2.toList)) )

  /*//val a: Either[String, List[A]] = Left("error")
  val a: Either[String, List[A]] = Right(List(A(1), A(2)))
  val b = a.getOrElse(List.empty[A]).map(_.id)
  println(b)*/

}