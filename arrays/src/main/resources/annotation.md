# Arrays

### Criação
* Sintaxe
```kotlin
val interestingThings = arrayOf(element1, element2)
```

* Exemplo
```kotlin
val interestingThings = arrayOf(
    "Kotlin",
    "Programming",
    "Comic Books"
)
```

### Métodos

* size = retorna a quantidade de elementos do Array
    ```kotlin
    println(interestingThings.size) // 3
    ```
  
* [index] / get(index) = recuperação de um elemento pelo index
    ```kotlin
    println(interestingThings[0]) // Kotlin
    println(interestingThings.get(0)) // Kotlin
    ```
  
* Percorrer um Array
  
    * Sintaxe
        ```kotlin
        for (nomeDoElemento in nomeDoArray) {
            // código
        }
        ```
      
    * Exemplo
        ```kotlin
        for (interestingThing in interestingThings) {
            println(interestingThing)
        }
        ```

* Percorrer um Array com forEach

    * Sintaxe
        ```kotlin
        // Por padrão, o nome da variável da expressão lambda é it
        interestingThings.forEach {
            // código
        }
        ```

    * Exemplo
        ```kotlin
        interestingThings.forEach {
            println(it)
        }
        // OU
         interestingThings.forEach { interestingThing ->
            println(interestingThing)
        }
        // OU
        interestingThings.forEachIndexed { index, interestingThing ->
            println("$interestingThing is at index $index")
        }
        ```