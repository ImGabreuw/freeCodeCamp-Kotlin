# Maps

### Criação

* Sintaxe

```kotlin
val map = mapOf(
    key to value,
    key to value,
    key to value
)
```

* Exemplo

```kotlin
val map = mapOf(
    1 to "a",
    2 to "b",
    3 to "c"
)
```

* Percorrer o Map com ForEach

```kotlin
map.forEach { (key, value) ->
    println("$key $value")
}
```