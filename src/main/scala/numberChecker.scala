import scala.io.StdIn.readLine

trait numberChecker {
  protected def enterNumber: Int={
    var number = 0;
    var bot= true
    while (bot){
      try{
        number=readLine().toInt
        bot= false
      }catch {
        case e:Exception=>println("Number only >> try again")
      }

    }

    number
  }
}
