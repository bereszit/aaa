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


  val a1:Seq[(String, Option[String], Option[String])] = Seq(
      ("1", Some("1"), Some("one")),      ("1", Some("1"), Some("two")),      ("1", Some("1"), Some("three"))
    , ("2", Some("2"), Some("one")),      ("2", None, None),                  ("2", Some("2"), None)
    , ("3", None, None),                  ("3", Some("3"), Some("two")),      ("3", None, Some("three"))
    , ("4", None, None),                  ("4", Some("4"), None),             ("4", None, Some("three")))

  val x: Seq[Option[String]] = Seq(Some("1"), Some("2"))
  (x(0), x(1)) match {
    case (Some(value),Some(value1)) => println(value + "-" + value1)
    case _ => println("error")
  }

  //println(a1.groupBy(_._1).map(v=>(v._1, v._2.map(x:Seq[(String, Option[String], Option[String])]=> (x._2 ++ x._3).reduceOption(_ + "-" + _)))))
  //val c = a1.groupBy(_._1).map(v=>(v._1, v._2.map(x=> (x._2, x._3)).reduceOption((a, b)=> (a._1 + b._1))))

  //val b = a1.groupBy(_._1).map(v=>(v._1, v._2.map(x:Seq[(String, Option[String], Option[String])]=> (x._2 ++ x._3).reduceOption(_ + "-" + _)))
  /*//val a: Either[String, List[A]] = Left("error")
  val a: Either[String, List[A]] = Right(List(A(1), A(2)))
  val b = a.getOrElse(List.empty[A]).map(_.id)
  println(b)*/

}