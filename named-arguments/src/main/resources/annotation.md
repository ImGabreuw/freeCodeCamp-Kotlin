# Named arguments

### Sem Named arguments
```kotlin
fun greetPerson(greeting: String, name: String) = println("$greeting $name")

fun main() {
    greetPerson("Hi", "Nate")
}
```

### Com Named arguments
```kotlin
fun greetPerson(greeting: String, name: String) = println("$greeting $name")

fun main() {
    greetPerson(greeting = "Hi", name = "Nate")
    // OU
    greetPerson(name = "Nate", greeting = "Hi")
}
```
* OBS: É possível misturar a ordem dos argumentos
