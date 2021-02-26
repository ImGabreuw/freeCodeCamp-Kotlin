# Mutable e Immutable Collections

* Por padrão, todas as coleções no Kotlin são imutáveis.

### Sintaxe

```kotlin
val mutableMap = mutableMapOf (
        key to value,
key to value,
key to value
)
```

* Exemplo

    ```kotlin
    val map = mutableMapOf(
        1 to "a",
        2 to "b",
        3 to "c"
    )
    ```

### Percorrer um MutableMap com ForEach

```kotlin
map.forEach { (key, value) ->
    // código
}
```

* Exemplo

  ```kotlin
  map.forEach { (key, value) ->
      println("$key $value")
  }
  ```

### Inserção de elementos

* 1º Forma
    * Sintaxe
      ```kotlin
      map.put(key, value)
      ```

    * Exemplo
      ```kotlin
      map.put(4, "d")
      ```

* 2º Forma
  * Sintaxe
    ```kotlin
    map[key] = value
    ```

  * Exemplo
    ```kotlin
    map[4] = "d"
    ```
