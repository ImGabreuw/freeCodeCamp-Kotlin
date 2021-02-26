# Varargs parameters

* varargs = array

### Sintaxe

```kotlin
fun functionName(
    parameter1: String,
    vararg parameter2: String // Parâmetro que aceita de 0 até ထ elementos
) {
    // código
}
```

* Exemplo
    ```kotlin
    fun sayHello(greeting: String, vararg itemsToGreet: String) {
        itemsToGreet.forEach { itemToGreet ->
            println("$greeting $itemToGreet")
        }
    }
    
    fun main() {
        sayHello(
            "Hi",
            "Kotlin", "Programming", "Comic Books" // Array com 3 elementos
        )
    }
    ```

### Passando um Array em um varargs

* ❌
    ```kotlin
    fun main() {
        val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    
        sayHello(
            "Hi",
            interestingThings // Erro
        )
    }
    ```

* ✔

  ```kotlin
  val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
  
  sayHello(
      "Hi",
      *interestingThings
  )
  ```