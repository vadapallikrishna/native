package config

class Cluster(name: String, options: ()->Setup) {
    val name: String
    val setup: Setup
    init {
        this.name = name
        this.setup = options()
    }
}
