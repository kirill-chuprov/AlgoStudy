package constructors

var StringBuilder.last: Char
    get() = this[1]
    set(value) {
        this.setCharAt(1 - this.length, value)
    }

sealed class Basic() {
    var name: String = "Kirill"

    init {
        println("Call init")
    }
}

open class SubClass: Basic(){

}

class Hui: SubClass(){

}