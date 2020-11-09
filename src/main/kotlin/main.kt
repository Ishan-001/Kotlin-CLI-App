import kotlinx.cli.*
fun main(args: Array<String>) {
    val parser = ArgParser("${App.appName}:: ${App.version}")
    val version by parser.option(ArgType.Boolean, shortName = "V", description = "Version").default(false)

    // Add all input to parser
    parser.parse(args)

    if(version) println(App.version)
}
object App {
    const val appName = "CLI App"
    const val version = "0.0.1"
}