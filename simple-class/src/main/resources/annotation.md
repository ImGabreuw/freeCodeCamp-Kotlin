# Simple class

### Sintaxe

* Classe sem membros (atributos ou métodos)

```kotlin
class NomeDaClasse 
```

* Classe com membros

```kotlin
class NomeDaClasse(_argumento1: String, _argumento2: String) {}

// OU
class Person constructor(_argumento1: String, _argumento2: String) {}
```

### Instanciação

* Usando keyword _init_
    ```kotlin
    class Person(_firstName: String, _lastName: String) {
        //Propriedades
        val firstName: String
        val lastName: String
        
        init {
            firstName = _firstName
            lastName = _lastName;
        }
    }
    ```

* Usando =
  ```kotlin
  class Person(_firstName: String, _lastName: String) {
    //Propriedades
    val firstName: String = _firstName
    val lastName: String = _lastName
  } 
  ```

* Atribuindo os argumentos como propriedades
  ```kotlin
  class Person(val firstName: String, val lastName: String)
  ```

* Construtor secundário

  ```kotlin
  // Classe Main
  fun main() {
    val person = Person()

    person.firstName
    person.lastName
  
    /* OUTPUT
    Init 1
    Init 2
    Secondery constructor
    */
  } 
  
  // Classe Person
  class Person(val firstName: String, val lastName: String) {
  
      init {
          println("Init 1")
      }
  
      constructor() : this("Peter", "Parker") {
          println("Secondery constructor")
      }
  
      init {
          println("Init 2")
      }
  }
  ```

* Substituindo o construtor secundário por Default parameter values

```kotlin
class Person(
    val firstName: String = "Peter",
    val lastName: String = "Parker"
)
```

### Getter and Setter

* val -> getters gerados automaticamente
* var -> setters gerados automaticamente

* Exemplo

  ```kotlin
  // Classe Main
  fun main() {
      val person = Person()
  
      person.firstName
      person.lastName
      person.nickName = "Shades"
      person.nickName = "New nickname"
      println(person.nickName)
  
      /* OUTPUT 
      
      The new nicknamee is Shades
      The new nicknamee is New nickname
      The returned value is New nickname
      New nickname
      */
  }
  
  // Classe Person
  class Person(val firstName: String = "Peter", val lastName: String = "Parker") {
      var nickName: String? = null
          // Setter customizado
          set(value) {
              // field = campo 'nickname'
              // value = novo valor para 'nickname'
              field = value
              println("The new nicknamee is $value")
          }
          // Getter customizado
          get() {
              println("The returned value is $field")
              return field
          }
  }
  ```

* Métodos dentro de uma classe

  ```kotlin
  fun printInfo() {
      val nickNameToPrint = nickName ?: "no nickname" // Operador elvis
  
      println("$firstName ($nickNameToPrint) $lastName")
  }
  ```
