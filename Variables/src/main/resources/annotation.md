# Variáveis

---

### Imutáveis

* Exemplo
  ```kotlin
  val name: String = "Nate"
  name = "Someone" // ❌ val não pode ser reatribuído
  ```

### Mutáveis

* Exemplo
  ```kotlin
  var name: String = "Nate"
  name = "Someone" // ✔
  ```

---  

### Escopo Global

* Exemplo
  ```kotlin
    val name: String = "Nate"
  
    fun main() {
        println(name) // ✔
    }
  ```

### Escopo Local

* Exemplo
  ```kotlin
    val name: String = "Nate"
    var greeting: String = "hello"
    
    fun main() {
      println(greeting) // hello
      println(name) // Nate
  
      greeting = "hi" // variável local
      println(greeting) // hi
      println(name) // Nate
    }
  ```

---

### Null Safe

* Exemplo
  ```kotlin
    val name: String = null // ❌ Null não pode ser um valor de uma String de tipo non-null
  ```

### Nullable variable

* Por padrão, toda variável no Kotlin é non-null. 

* Exemplo atribuindo NULL
  ```kotlin
    val name: String? = null // ✔ 
  ```

* Exemplo atribuindo um VALOR
  ```kotlin
    val name: String = "Nate"
    var greeting: String? = "hello"
    
    fun main() {
      println(greeting)
      println(name)
  
      greeting = null
  
      println(greeting)
      println(name)
    }
  ```
  
### Inferência de tipos

* Exemplo
  ```kotlin
    val name = "Nate"
  ```
  
* Exemplo atribuindo NULL (❌)
  ```kotlin
    val name = "Nate"
    var greeting = "hello"
    
    fun main() {
      println(greeting)
      println(name)
  
      greeting = null // ❌ Null não pode ser um valor de uma String de tipo non-null
  
      println(greeting)
      println(name)
    }
  ```

* Exemplo atribuindo NULL (✔)
  ```kotlin
    var greeting = null // Variável sem tipo (Tipo: Nothing)
  
    // OU
  
    var greeting: String? = null  
  ```