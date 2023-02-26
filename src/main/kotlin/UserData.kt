data class UserData (val id: Int, var name: String) {
    val isValidName: Boolean
        get() = name != ""
}
