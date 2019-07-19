package scala

class PhysicsVector(var x: Double, var y: Double, var z: Double) {

  override def toString: String = s"($x, $y, $z)"

  override def equals(other: Any): Boolean = {
    other match {
      case o: PhysicsVector => (x==o.x & y==o.y & z==o.z)
      case _ => false
    }
  }

}
