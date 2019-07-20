package scala

import org.scalatest._


class TestUpdateVelocity extends FunSuite with BeforeAndAfter {

  var test_object: PhysicalObject = _
  var test_world: World = _
  var physics: Physics = _
  var answer_object: PhysicalObject = _

  before{
    test_object = new PhysicalObject()
    test_world = new World(9.8)
    physics = new Physics()
    answer_object = new PhysicalObject()
  }

  test("Test non-negative case") {
    test_object.velocity = new PhysicsVector(1,1,10)
    physics.updateVelocity(test_object, test_world, 1)
    answer_object.velocity = new PhysicsVector(1,1,0.2)

    val result_string = test_object.toString
    val answer_string = answer_object.toString

    print(s"expected ->  $answer_string     ...    got -> $result_string \n")
    assert(test_object == answer_object)
  }

  test("Test negative case") {
    test_object.velocity = new PhysicsVector(1,1,-1)
    physics.updateVelocity(test_object, test_world, 3)
    answer_object.velocity = new PhysicsVector(1,1,0)

    val result_string = test_object.toString
    val answer_string = answer_object.toString

    print(s"expected ->  $answer_string     ...    got -> $result_string \n")
    assert(test_object == answer_object)
  }

  test("Trivial") {
    assert(1==1)
  }

}