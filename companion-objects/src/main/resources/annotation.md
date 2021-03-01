# Companion Objects

### Sintaxe
```kotlin
class NomeDaClasse private constructor(val argmento1: String) {
    companion object {
        fun create() = Entity("argumento1")
    }
}
// OU
class NomeDaClasse private constructor(val argmento1: String) {
    companion object NomeCompanion {
        fun create() = Entity("argumento1")
    }
}
```

* Exemplo
```kotlin
// Classe Main
fun main() {
    // Essa forma só é necessário se for em um arquivo Java
    val entity = Entity.Companion.create()
    // OU
    val entity = Entity.create()
}

// Classe Entity
class Entity private constructor(val id: String) {
    companion object {
        fun create() = Entity("id")
    }
}
//OU
class Entity private constructor(val id: String) {
    // É uma boa prática dar nomes aos 'companion' 
    // se essa classe for usada em arquivos Java
    companion object Factory {
        fun create() = Entity("id")
    }
}
```