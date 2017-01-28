
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/groshare/conf/routes
// @DATE:Sat Jan 28 22:34:17 UTC 2017


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
