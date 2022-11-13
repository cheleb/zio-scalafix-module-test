/*
rule = ZIOAccessible
 */
package test

import zio._

@Accessible
trait TestZIOServiceWithCompanion {
  def testTask(i: Int): Task[Int]
  def testIO(i: Int): IO[Throwable, Int]
  def test2(i: Int): ZIO[Any, Throwable, Int]
  def test3(i: Int): ZIO[Any, Throwable, Int]
}
class TestZIOServiceWithCompanionImpl extends TestZIOServiceWithCompanion {
  def testTask(i: Int): Task[Int] = ???
  def testIO(i: Int): IO[Throwable, Int] = ???
  def test2(i: Int): ZIO[Any, Throwable, Int] = ???
  def test3(i: Int): ZIO[Any, Throwable, Int] = ???
}

object TestZIOServiceWithCompanion {
  val zozo = "bo"
  def nenai = "belle"
  def testIO(i: Int): ZIO[TestZIOServiceWithCompanion, Throwable, Int] =
    ZIO.serviceWithZIO[TestZIOServiceWithCompanion](_.testIO(i))
  def testTask(i: Int): RIO[TestZIOServiceWithCompanion, Int] =
    ZIO.serviceWithZIO[TestZIOServiceWithCompanion](_.testTask(i))
  def test2(i: Int): ZIO[TestZIOServiceWithCompanion, Throwable, Int] =
    ZIO.serviceWithZIO[TestZIOServiceWithCompanion](_.test2(i))
  def test3(i: Int): ZIO[TestZIOServiceWithCompanion, Throwable, Int] =
    ZIO.serviceWithZIO[TestZIOServiceWithCompanion](_.test3(i))
}
