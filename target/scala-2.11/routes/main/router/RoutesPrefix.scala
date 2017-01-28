
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ryanmccormack/computer-database-scala/conf/routes
// @DATE:Sat Jan 28 15:40:05 EST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
