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

    "have +(Rational) method" in {
      val oneHalf = new Rational(1, 2)
      val twoThirds = new Rational(2, 3)
      (oneHalf + twoThirds).toString must equalTo("7/6")
      (oneHalf.+(twoThirds).toString) must_==("7/6")
    }

    "have *(Rational) method" in {
      val oneHalf = new Rational(1, 2)
      val twoThirds = new Rational(2, 3)
      (oneHalf * twoThirds).toString must_== "1/3"
      (oneHalf.*(twoThirds).toString) must_== "1/3"

      (oneHalf + oneHalf * twoThirds).toString must_== "5/6"
      ((oneHalf + oneHalf) * twoThirds).toString must_== "2/3"
      (oneHalf + (oneHalf * twoThirds)).toString must_== "5/6"
    }

    "have lessThan(Rational) method" in {
      val oneHalf = new Rational(1, 2)
      val twoThirds = new Rational(2, 3)
      oneHalf lessThan twoThirds must beTrue
    }

    "have max(Rational) method" in {
      val oneHalf = new Rational(1, 2)
      val twoThirds = new Rational(2, 3)
      oneHalf max twoThirds must_== twoThirds
    }

    "have auxiliary constructor that has 1 parameter" in {
      val r = new Rational(3)
      r must_!= null
      r.numer must_==  3
      r.denom must_==  1
    }

    "normalize numor and denom" in {
      val r = new Rational(66, 42)
      r.toString must_== "11/7"
    }
  }
}
