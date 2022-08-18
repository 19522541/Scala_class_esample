class Point extends numberChecker {
  var x:Int =0
  var y:Int= 0
  def set(): Unit ={
    println("nhap toa do x:")
   x= enterNumber
    println("nhap toa do y:")
    y= enterNumber
    println(this)
  }
  override def toString: String = s"${x}_${y}"
}
