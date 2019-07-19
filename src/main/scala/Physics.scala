package scala

class Physics {

  def computePotentialLocation(obj: PhysicalObject, delta: Double): PhysicsVector = {

    val apply_velocity = (state: Double, velocity: Double, time: Double) => {state + (velocity * time)}: Double
    new PhysicsVector(apply_velocity(obj.location.x, obj.velocity.x, delta),
                      apply_velocity(obj.location.y, obj.velocity.y, delta),
                      {
                        if (apply_velocity(obj.location.z, obj.velocity.z, delta)>0){
                        apply_velocity(obj.location.z, obj.velocity.z, delta)
                        } else {
                          0.0
                        }
                      }
    )

  }

  def updateVelocity(obj: PhysicalObject, world: World, delta: Double): Unit = {

    obj match {
      case obj.velocity.z < 0 & obj.location.z == 0 => obj.velocity.z = 0
      case _ => obj.velocity.z += obj.velocity.z - world.gravity * delta
    }

  }

}