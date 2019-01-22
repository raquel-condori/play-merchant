// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rcondori/projects/play1/play6/conf/routes
// @DATE:Thu Jan 17 11:16:25 BOT 2019


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
