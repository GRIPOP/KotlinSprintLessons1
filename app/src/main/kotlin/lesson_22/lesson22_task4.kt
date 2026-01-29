package org.example.app.lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    println(viewModel.mainScreenState.data)
    viewModel.loadData()
    println(viewModel.mainScreenState.data)

}

class MainScreenViewModel() {
    var mainScreenState: MainScreenState = MainScreenState()

    fun loadData() {

    }

    data class MainScreenState(val data: String = "отсутствие данных", val isLoading: Boolean = false) {

    }
}
