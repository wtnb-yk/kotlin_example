class User {
    lateinit var name: String
    val isValidName: Boolean
        get() = name != ""
}
