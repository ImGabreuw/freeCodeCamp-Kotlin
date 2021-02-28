fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
    println(provider.getSessionId())

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println("Not a session info provider")
    } else {
        println("Is a session info provider")
        infoProvider.getSessionId()
    }
}