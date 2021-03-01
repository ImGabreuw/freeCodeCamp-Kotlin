class FancyInfoProvider: BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "Fancy info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }
}