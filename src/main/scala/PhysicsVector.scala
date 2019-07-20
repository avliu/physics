package scala

class PhysicsVector(var x: Double, var y: Double, var z: Double) {

  override def toString: String = s"($x, $y, $z)"

  override def equals(other: Any): Boolean = {
    other match {
      case o: PhysicsVector => math.abs(x-o.x) < .0001 & math.abs(y-o.y) < .0001 & math.abs(z-o.z) < .0001
      case _ => false
    }
  }

}
