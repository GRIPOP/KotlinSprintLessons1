package org.example.app.lesson_22

fun main() {


}

class MainScreenViewModel(val mainScreenState: MainScreenState) {
    fun loadData() {

    }

    data class MainScreenState(var data: String, var isLoading: Boolean = false) {

    }
}