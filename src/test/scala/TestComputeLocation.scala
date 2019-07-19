package scala

import org.scalatest._


class TestComputeLocation extends FunSuite with BeforeAndAfter {

  var test_object: PhysicalObject = _
  var physics: Physics = _
  var answer_vector: PhysicsVector = _

  before{
    test_object = new PhysicalObject(new PhysicsVector(1.0, 3.0, 4.0), new PhysicsVector(1.0, 1.0, -1.0))
    physics = new Physics()
  }

  test("Test non-negative case") {
    val result : PhysicsVector = physics.computePotentialLocation(test_object, 3)
    answer_vector = new PhysicsVector(4.0, 6.0, 1.0)

    val result_string = result.toString
    val answer_string = answer_vector.toString

    print(s"expected: $answer_string, got $result_string \n")
    assert(result.equals(answer_vector))
  }

  test("Test negative case") {
    val result : PhysicsVector = physics.computePotentialLocation(test_object, 5)
    answer_vector = new PhysicsVector(6.0, 8.0, 0)

    val result_string = result.toString
    val answer_string = answer_vector.toString

    print(s"expected: $answer_string, got $result_string \n")
    assert(result.equals(answer_vector))
  }

  test("Trivial") {
    assert(1==1)
  }

}