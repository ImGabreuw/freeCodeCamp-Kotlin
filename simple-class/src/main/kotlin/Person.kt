class Person(val firstName: String = "Peter", val lastName: String = "Parker") {
    var nickName: String? = null
        set(value) {
            field = value
            println("The new nicknamee is $value")
        }
        get() {
            println("The returned value is $field")
            return field
        }

    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"

        println("$firstName ($nickNameToPrint) $lastName")
    }
}