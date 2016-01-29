package test

import play.api.mvc.Action

class TestController {

  def post = Action.async { implicit req =>

    throw new IllegalStateException

  }
}
