package example

import org.specs2.mutable.Specification
import org.specs2.specification.BeforeAfterAll

class HelloSpec extends Specification with BeforeAfterAll {
  def beforeAll(): Unit = {
    println("Before all!")
  }

  def afterAll(): Unit = {
    println("After all!")
  }

  "The Hello object" >> {
    "say hello" >> {
      "first time" in {
        Hello.greeting shouldEqual "hello"
      }
    }
  }

  "The Hello object" >> {
    "say hello" >> {
      "again" in {
        Hello.greeting shouldEqual "hello"
      }
    }
  }
}
