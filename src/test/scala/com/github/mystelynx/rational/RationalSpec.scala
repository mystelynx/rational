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
  }
}
