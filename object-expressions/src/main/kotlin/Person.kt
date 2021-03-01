class Person(val firstName: String = "Peter", val lastName: String = "Parker") {
    var nickName: String? = null

    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"

        println("$firstName ($nickNameToPrint) $lastName")
    }
}
