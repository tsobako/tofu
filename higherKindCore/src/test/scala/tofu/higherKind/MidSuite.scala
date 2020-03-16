package tofu.higherKind

import cats.tagless.ApplyK
import cats.{Monoid, Semigroup}

object MidSuite {
  def summonMidInstances[F[_], U[_[_]]: ApplyK, W[_[_]]: MonoidalK](): Unit = {
    implicitly[Semigroup[U[Mid[F, *]]]]
    implicitly[Monoid[W[Mid[F, *]]]]
    ()
  }
}
