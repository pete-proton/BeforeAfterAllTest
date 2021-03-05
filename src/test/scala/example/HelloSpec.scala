package example

import com.typesafe.scalalogging.Logger
import org.specs2.matcher.DataTables
import org.specs2.specification.BeforeAfterAll
import org.specs2.mutable.{Before, Specification}

class HelloSpec extends Specification with Before with DataTables with BeforeAfterAll {
  val logger = Logger(classOf[HelloSpec])

  def beforeAll(): Unit = {
    logger.info("Before all!")
  }

  def afterAll(): Unit = {
    logger.info("After all!")
  }

  "The Hello object" >> {
    "say hello" >> {
      "first time" in {
        logger.info("first test")
        Hello.greeting shouldEqual "hello"
      }
    }
  }

  "The Hello object" >> {
    "say hello" >> {
      "again" in {
        logger.info("second test")
        Hello.greeting shouldEqual "hello"
      }
    }
  }

  override def before: Any = ()
}
