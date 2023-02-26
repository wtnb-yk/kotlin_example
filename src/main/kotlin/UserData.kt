data class UserData (val id: Int, var name: String) {
    val isValidName: Boolean
        get() = name != ""

    fun getUserString(user: User?, newName: String): String? {
        return user?.run {
            name = newName
            toString()
        }
    }
}
