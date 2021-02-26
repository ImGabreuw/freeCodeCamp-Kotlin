fun main() {
    val map = mapOf(
        1 to "a",
        2 to "b",
        3 to "c"
    )

    map.forEach { (key, value) ->
        println("$key $value")
    }
}