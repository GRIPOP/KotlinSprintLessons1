package org.example.app.lesson_22

fun main() {
    val viewModel = MainScreenViewModel()

    println(viewModel.mainScreenState)
    viewModel.loadData()
    println(viewModel.mainScreenState)
    viewModel.loadData()
    println(viewModel.mainScreenState)
}

class MainScreenViewModel() {
    var mainScreenState: MainScreenState = MainScreenState()

    fun loadData() {

        mainScreenState.data = readln().lowercase()
        mainScreenState = when (mainScreenState.data) {
            "загрузка данных" -> mainScreenState.copy(isLoading = true)
            "наличие загруженных данных" -> mainScreenState.copy(isLoading = false)
            else -> mainScreenState.copy()
        }
    }

    data class MainScreenState(var data: String = "отсутствие данных", val isLoading: Boolean = false)
}

