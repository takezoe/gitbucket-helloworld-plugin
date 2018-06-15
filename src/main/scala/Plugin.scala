import io.github.gitbucket.helloworld.controller.HelloWorldController
import io.github.gitbucket.solidbase.model.Version

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "helloworld"
  override val pluginName: String = "HelloWorld Plugin"
  override val description: String = "Show simple message on GitBucket"
  override val versions: List[Version] = List(
    new Version("1.0.0"),
    new Version("1.0.1")
  )

  override val controllers = Seq(
    "/*" -> new HelloWorldController()
  )
}
