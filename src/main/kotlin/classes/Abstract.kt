package classes

abstract class Abstract(var first: String) {
    companion object {
        override fun toString(): String {
            return super.toString()
        }
    }

}

class Realisation : Abstract("name") {
    init {
        this.first
    }
}