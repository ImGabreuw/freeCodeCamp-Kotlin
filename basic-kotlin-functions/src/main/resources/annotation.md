# O Básico sobre funções

### Sintaxe
```kotlin
fun nomeDaFuncao(): TipoDoRetorno {
    // código
    return retorno
}
```

### Função com retorno do tipo 'String'
* Exemplo:
```kotlin
fun getGreeting(): String {
    return "Hello Kotlin"
}

fun main() {
    println("Hello World")
    println(getGreeting())
}
```

### Função com retorno do tipo 'Unit'
* Exemplo:
```kotlin
fun getGreeting(): String {
    return "Hello Kotlin"
}

// Por padrão, toda função tem como tipo de retorno o Unit
fun sayHello(): Unit { 
    println(getGreeting())
}
// OU
fun sayHello() {
    println(getGreeting())
}

fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello()
}
```

### Simple Expression Function
* Exemplo com retorno explícito:
```kotlin
// Função com apenas uma expressão
fun getGreeting(): String = "Hello Kotlin" 

fun sayHello(): Unit {
    println(getGreeting())
}

fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello()
}
```

* Exemplo com retorno implícito:
```kotlin
// Função com apenas uma expressão + inferência de tipo
fun getGreeting() = "Hello Kotlin" 

fun sayHello(): Unit {
    println(getGreeting())
}

fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello()
}
```