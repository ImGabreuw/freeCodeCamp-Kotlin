# Funções com parâmetro

### Exemplo com 1 parâmetro + Single Expression Function
```kotlin
fun sayHello(itemToGreet: String) = println("Hello $itemToGreet")

fun main() {
    sayHello("Kotlin") // Hello Kotlin
    sayHello("World") // Hello World
}
```

### Exemplo com 2 / + parâmetro + Single Expression Function
```kotlin
fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

fun main() {
    sayHello("Hey", "Kotlin") // Hey Kotlin
    sayHello("Hello", "World") // Hello World
}
```