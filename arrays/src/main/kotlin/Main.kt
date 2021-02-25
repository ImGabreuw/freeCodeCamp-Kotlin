fun main() {
    val interestingThings = arrayOf(
        "Kotlin",
        "Programming",
        "Comic Books"
    )

    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }
}