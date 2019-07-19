package scala

class World(g: Double) {

  var gravity =  g match{
    case g<0 => {println("given gravity was negative, taking abs value"); 0-g}
    case _ => g
  }
  var objects: List[PhysicalObject] = List()
  var boundaries: List[Boundary] = List()

}
