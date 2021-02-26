fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val interestingThings = mutableListOf(
        "Kotlin",
        "Programming",
        "Comic Books"
    )

    sayHello(
        "Hi",
        interestingThings
    )
}