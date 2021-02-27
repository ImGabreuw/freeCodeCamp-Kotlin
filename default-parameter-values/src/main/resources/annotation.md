# Default parameter values

### Sintaxe
```kotlin
fun nomeDoMetodo(
    argumento1: String = valorPadrao, 
    agumento2: String = valorPadrao
) {
    // código
}
```

* Exemplo
```kotlin
fun greetPerson(
    greeting: String = "Hello", 
    name: String = "Kotlin"
) = println("$greeting $name")
```

### Exemplo
```kotlin
fun greetPerson(
    greeting: String = "Hello", 
    name: String = "Kotlin"
) = println("$greeting $name")

fun main() {
    greetPerson(greeting = "Hi", name = "Nate")
    greetPerson(name = "Nate")
    greetPerson()
}
```