class Circle(R:Int,b:Int,O:Point) extends Ellipse (R, b, O){
  def this(a:Int,point: Point)= this(a,a,point)
  override def perimeter(): Float = ???
  override def Area(): Float = ???
  override def display(): Unit = println("this is Circle")
}
