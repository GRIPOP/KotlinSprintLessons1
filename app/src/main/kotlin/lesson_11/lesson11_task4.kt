package org.example.app.lesson_11

class Category(
    val id: Int,
    val name: String,
    val picture: String,
    val description: String,
    val recipes: String,
    )

class Recipe(
    val id: Int,
    val name: String,
    val picture: String,
    val ingredients: List<String>,
    val stepsOfCooking: String
    )

class Ingredient(
    val name: String,
    val quantity: Int,
    val units: String,
    )