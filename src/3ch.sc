def arrayOfN(n: Int): Array[Int] = Array[Int]() ++ (0 until n)

val a = arrayOfN(11)
def swapArrayInPlace[T](a: Array[T]) {
  for (i <- 0 until (a.length/2) * 2  by 2) {
    val t = a(i)
    a(i) = a(i+1)
    a(i+1) = t
  }
}
swapArrayInPlace(a)
a

def swapArrayToNew[T](a: Array[T]) = {
  val indexs: Array[Int] = (((1 until a.length) toArray).sliding(2,2) map(_.reverse) toArray).flatten
  indexs map (a(_))
}

def positiveAndNegative(a: Array[Int]) = a.filter(_>0) ++ a.filter(_<=0)





def average(a: Array[Double]): Double = a.sum/a.length
import collection.mutable.ArrayBuffer
import scala.util.Sorting._
def revSortA(a: Array[Int]) = {
  quickSort(a)
  a.reverse
}
def revSortAB(a: ArrayBuffer[Int]) = (a sortWith(_>_)).reverse


def onlyUniuq[T](a: Array[T]) = a filter(x => a.count(x == _) == 1)

import scala.collection.JavaConversions._
import java.util.TimeZone
val allAmer =  TimeZone.getAvailableIDs().filter(
  _.startsWith("America")) map (_.replace("America/", ""))



