## sbt project compiled with Scala 2 or 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 2 or 3 REPL.

https://github.com/cheleb/zio-accessible-scalafix are applied to add Service method to companion object 

See [sample without companion](src/main/scala/test/TestZIOService.scala)

Then run ```sbt compile``` and you will see the companion object is generated

See [sample with existing companion](src/main/scala/test/TestZIOServiceWithCompanion.scala) where the companion object is already present

Then run ```sbt compile``` and you will see the companion object is modified with the missing Service method.

