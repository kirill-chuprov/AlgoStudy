package classes

interface Messenger<in T : Message, out V : Response>

open class Message(val text: String)

class EmailMessage(text: String) : Message(text)
class Response(text: String) : Message(text)

fun changeMessengerToEmail(obj: Messenger<EmailMessage, Response>) {
    var message = obj
    message = object : Messenger<Message, Response> {

    }
}

fun changeMessengerToDefault(obj: Messenger<Message, Response>) {
    val messenger: Messenger<EmailMessage, Response> = obj
}

/////////////

interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    x.compareTo(1.0) // 1.0 имеет тип Double, расширяющий Number
    // Таким образом, мы можем присвоить значение x переменной типа Comparable<Double>
    val y: Comparable<Double> = x // OK!
}

//////

interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>) {
    val objects: Source<Any> = strs // Всё в порядке, т.к. T — out-параметр
    // ...
}