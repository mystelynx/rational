package com.github.mystelynx.rational

/**
 * Created with IntelliJ IDEA.
 * User: urakawa
 * Date: 12/07/15
 * Time: 18:49
 * To change this template use File | Settings | File Templates.
 */

class Rational(n: Int, d: Int) {

  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = numer + "/" + denom

  /*
    クラスパラメータはaddメソッドのスコープ内であるが、thatはaddメソッドのレシーバではなく、
    n, dにアクセスできない。
    クラスパラメータはフィールドではない。
   */
//  def add(that: Rational): Rational = {
//    new Rational(n * that.d + that.n * d, d * that.d)
//  }

  def add(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def lessThan(that: Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if (this lessThan that) that else this
}