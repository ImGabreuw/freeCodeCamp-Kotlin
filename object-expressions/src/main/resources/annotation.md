# Object Expressions

### Keyword _object_

* Sintaxe

    ```kotlin
    val nomeDaVariavel = object : NomeDaInterface {
        // métodos a serem implementados / criados
    }
    ```

* Exemplo

  ```kotlin
  fun main() {
      val provider = object : PersonInfoProvider {
          override val providerInfo: String
              get() = "New Info Provider"
  
          fun getSessionId() = "id"
      }
  
      provider.printInfo(Person())
      provider.getSessionId()
  }
  ```
  
### OBS: _object_  <=> classe anônima em Java