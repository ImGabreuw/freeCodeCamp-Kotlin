fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")

    sayHello(
        "Hi",
        *interestingThings
    )
}