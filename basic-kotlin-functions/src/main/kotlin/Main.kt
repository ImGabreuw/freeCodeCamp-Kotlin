fun getGreeting() = "Hello Kotlin"

fun sayHello(): Unit {
    println(getGreeting())
}

fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello()
}