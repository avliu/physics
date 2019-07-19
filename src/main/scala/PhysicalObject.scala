package scala

class PhysicalObject(var location: PhysicsVector = new PhysicsVector(0,0,0),
                     var velocity: PhysicsVector= new PhysicsVector(0,0,0)) {

  def move(dx: Double, dy: Double, dz: Double): Unit = {
    location.x += dx
    location.y += dy
    location.z += dz
  }

  override def toString: String = {
    val s1 = location.toString
    val s2 = velocity.toString
    s"location: $s1, velocity: $s2"
  }

  override def equals(other: Any): Boolean = {
    other match {
      case o: PhysicalObject => (location == o.location & velocity == o.velocity)
      case _ => false
    }
  }

}
