
import scala.collection.mutable.ListBuffer
class Polygon  {
  protected var numberSide: Byte = 3
  var points :ListBuffer[Point]= ListBuffer()
  def setPoints(): Unit = {
     for (i <- 1 to  numberSide){
       println(s"index${i}")
       val temp = new Point()
       temp.set()
       points += temp
     }
  }

  override def toString: String = points.toString()
}
