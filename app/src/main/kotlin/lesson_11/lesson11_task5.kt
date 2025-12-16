package org.example.app.lesson_11

fun main() {

}

class Forum(
    val membersForum: MutableList<MemberForum>,
    //Тут вопрос по свойствам, их нужно добавлять просто логически?
    // Например, в Форум может входить: Список людей, Все сообщения. А должны ли единичные экземпляры входить(имею ввиду один человек, одно сообщение)


) {
    class Builder(
        val membersForum: MutableList<MemberForum>,
        val user: MemberForum,
        val messages: MutableList<String>,
        //Тут вопрос по свойствам
    ) {

        fun createNewUser(user: MemberForum): MemberForum { //По поводу принимаемого параметра вроде тут верно?
            val id = (1..1000).random() // Является ли это генерацией id для данной задачи?
            membersForum.add(user)
            return user
        }
        fun createNewMessage(id: MessageForum) {
            if (user in membersForum) {
                // тут не понимаю как вывести сообщение? Куда и к чему его привязать
            }
        }

        fun printThread(): MutableList<String> {
            return messages
        }
    }
}

class MemberForum(
    var userId: Int,
    val userName: String,
)

class MessageForum(
    val authorId: Int,
    val message: String,
)
