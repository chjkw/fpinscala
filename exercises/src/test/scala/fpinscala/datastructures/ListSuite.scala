package fpinscala.datastructures

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
  * Created with IntelliJ IDEA.
  * User: chjkw
  * Date: 2016. 1. 22.
  * Time: 오전 8:23
  */
@RunWith(classOf[JUnitRunner])
class ListSuite extends FunSuite {
  import fpinscala.datastructures.List._

  val x = List(1,2,3,4,5)
  test("productTest") {
    assert(product(Nil) == 1.0)
  }

  test("dropTest") {
    assert(drop(x, 2) == List(3,4,5))
    assert(drop(x, 2) != List(2,3,4,5))
  }

  test("setHeadTest") {
    assert(setHead(x, 6) == List(6,2,3,4,5))
    assert(setHead(x, 9) == List(9,2,3,4,5))
  }




}
