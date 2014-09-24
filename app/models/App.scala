package models

import scalikejdbc._
import skinny.orm._, feature._
import org.joda.time.DateTime

/**
 * Created by Mitsuki OGASAHARA on 2014/09/25.
 */

case class App(id: Int)

object App extends SkinnyCRUDMapper[App] {
  override def defaultAlias: Alias[App] = createAlias("a")

  override def extract(rs: WrappedResultSet, rn: ResultName[App]): App = autoConstruct(rs, rn)
}
