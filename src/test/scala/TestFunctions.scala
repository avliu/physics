package scala

class TestFunctions {

  def summary_string(calculated: Any, actual: Any): String = {
    val calculated_str = calculated.toString
    val actual_str = actual.toString
    s"EXPECTED-> $actual_str     ...     GOT-> $calculated_str \n"
  }

}
