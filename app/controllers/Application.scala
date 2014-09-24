package controllers

import org.json4s.JsonDSL._
import org.json4s.jackson.JsonMethods.{render => renderjs, _}
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def index_json = Action {
    Ok(compact(renderjs(Seq(1, 2, 3))))
  }

}