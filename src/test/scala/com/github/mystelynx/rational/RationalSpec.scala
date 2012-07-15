package com.github.mystelynx.rational

import org.specs2.mutable.Specification

/**
 * Created with IntelliJ IDEA.
 * User: urakawa
 * Date: 12/07/15
 * Time: 18:47
 * To change this template use File | Settings | File Templates.
 */

class RationalSpec extends Specification {

  "Rational class" should {
    "have 2 parameters to construct" in {
      val r = new Rational(1, 2)
      r must not equalTo(null)
    }

    "have toString method" in {
      val r1 = new Rational(1, 2)
      r1.toString must equalTo("1/2")
    }

    "occur exception to construct when denominator == 0" in {
      new Rational(5, 0) must throwAn[IllegalArgumentException]
    }

    "have 2 fields" in {
      val r = new Rational(1, 2)
      r.numer must_== 1
      r.denom must_== 2
    }

    "have add(Rational) method" in {
      val oneHalf = new Rational(1, 2)
      val twoThirds = new Rational(2, 3)
      (oneHalf add twoThirds).toString must equalTo("7/6")
    }
  }
}
