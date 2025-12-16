package org.example.app.lesson_11

class Category(
    val id: Int,
    val name: String,
    val picture: String,
    val description: String,
    val recipes: List<Recipe>,
    )

class Recipe(
    val id: Int,
    val name: String,
    val picture: String,
    val ingredients: List<Ingredient>,
    val stepsOfCooking: List<String>,
    )

class Ingredient(
    val name: String,
    val quantity: String,
    val units: String,
    )