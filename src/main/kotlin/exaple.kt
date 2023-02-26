fun main() {
    val user = UserData(1, "Tanaka")
    val same = UserData(1, "Tanaka")
    val other = UserData(2, "Tanaka")

    println(user == same)
    println(user === same)
    println(user == other)

    println("user=${user.hashCode()}")
    println("same=${same.hashCode()}")
    println("other=${other.hashCode()}")

    val set = hashSetOf(user)
    println(set.contains(same))
    println(set.contains(other))

    println(user.toString())

    println(user.component1())
    println(user.component2())

    val updated = user.copy(id = 1, name = "Kotlin")
    println(updated.toString())
}
