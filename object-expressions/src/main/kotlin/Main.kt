fun main() {
    val provider = object: PersonInfoProvider {
        override val providerInfo: String
            get() = "New Info Provider"

        fun getSessionId() = "id"
    }

    provider.printInfo(Person())
    provider.getSessionId()
}