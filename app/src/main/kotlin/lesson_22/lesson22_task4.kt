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

        mainScreenState = when (val newData = readln().lowercase()) {
            "загрузка данных" -> mainScreenState.copy(data = newData, isLoading = true)
            "наличие загруженных данных" -> mainScreenState.copy(data = newData, isLoading = false)
            else -> mainScreenState
        }
    }

    data class MainScreenState(val data: String = "отсутствие данных", val isLoading: Boolean = false)
}

