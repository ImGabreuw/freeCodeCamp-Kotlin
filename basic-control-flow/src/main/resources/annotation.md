# Básico sobre controle de fluxo

### IF
* Exemplo
```kotlin
val name = "Nate"
var greeting: String? = null

fun main() {
    if (greeting != null) {
        println(greeting)
    }

    println(name) // Hi Nate
}
```

### IF-ELSE
* Exemplo
```kotlin
val name = "Nate"
var greeting: String? = null

fun main() {
    if (greeting != null) {
        println(greeting)
    } else {
        println("Hi")
    }

    println(name) // Hi Nate
}
```

### WHEN ( = switch no Java)
* Exemplo
```kotlin
val name = "Nate"
var greeting: String? = null

fun main() {
    when(greeting) {
        null -> println("Hi") // = 'case' no Java
        else -> println(greeting) // = 'default' no Java
    }

    println(name) // Hi Nate
}
```

### IF-ELSE e WHEN como expressões
* Exemplo IF-ELSE
```kotlin
val name = "Nate"
var greeting: String? = null

fun main() {
    val greetingToPrint = if (greeting != null) greeting else "Hi"

    println(greetingToPrint) // Hi
    println(name) // Nate
}
```

* Exemplo WHEN
```kotlin
val name = "Nate"
var greeting: String? = null

fun main() {
    val greetingToPrint = when (greeting) {
        null -> "Hi"
        else -> greeting
    }

    println(greetingToPrint) // Hi
    println(name) // Nate
}
```