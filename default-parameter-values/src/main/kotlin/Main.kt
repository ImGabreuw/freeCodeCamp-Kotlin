
fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main() {
    val interestingThings = arrayOf(
        "Kotlin",
        "Programming",
        "Comic Books"
    )

    sayHello(greeting = "Hi", *interestingThings)
}