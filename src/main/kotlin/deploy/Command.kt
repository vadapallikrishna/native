package deploy

class Command {
    var name: String
    var options: MutableList<String>

    constructor(pname: String) {
        name = pname
        options = ArrayList()
    }

    fun option(o: String): Command {
        this.options.add(o)
        return this
    }


}