package scala

import org.scalatest._


class TestComputeLocation extends FunSuite with BeforeAndAfter {

  var test_object: PhysicalObject = _
  var physics: Physics = _
  var answer_vector: PhysicsVector = _
  val test_functions: TestFunctions = new TestFunctions


  before{
    test_object = new PhysicalObject(new PhysicsVector(1.0, 3.0, 4.0), new PhysicsVector(1.0, 1.0, -1.0))
    physics = new Physics()
  }

  test("Test non-negative case") {
    val result_vector : PhysicsVector = physics.computePotentialLocation(test_object, 3)
    answer_vector = new PhysicsVector(4.0, 6.0, 1.0)

    print(test_functions.summary_string(result_vector, answer_vector))
    assert(result_vector.equals(answer_vector))
  }

  test("Test negative case") {
    val result_vector : PhysicsVector = physics.computePotentialLocation(test_object, 5)
    answer_vector = new PhysicsVector(6.0, 8.0, 0)

    print(test_functions.summary_string(result_vector, answer_vector))
    assert(result_vector.equals(answer_vector))
  }

  test("Trivial") {
    assert(1==1)
  }

}