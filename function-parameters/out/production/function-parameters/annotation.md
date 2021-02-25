# Funções com parâmetro

### Exemplo com 1 parâmetro + Single Expression Function
```kotlin
fun sayHello(itemToGreet: String) = println("Hello $itemToGreet")

fun main() {
    sayHello("Kotlin")
    sayHello("World")
}
```