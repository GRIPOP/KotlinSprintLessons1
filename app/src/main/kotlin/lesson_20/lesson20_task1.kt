
fun main() {
    val congratulationsUser: (String) -> Unit = { userName: String -> println("С наступающим Новым Годом, $userName") }
    congratulationsUser("Sheldon")
}