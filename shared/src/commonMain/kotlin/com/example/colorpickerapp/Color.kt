package com.example.colorpickerapp


// Simple Color data class
data class Color(val name: String, val hex: String)

object ColorRepository {
    // List of predefined colors
    fun getColors(): List<Color> {
        return listOf(
            Color("Red", "#FF0000"),
            Color("Green", "#00FF00"),
            Color("Blue", "#0000FF"),
            Color("Yellow", "#FFFF00"),
            Color("Purple", "#800080"),
            Color("Cyan", "#00FFFF"),
            Color("Cyan2", "#00FFFF"),
            Color("Cyan2", "#00FFFF"),
            Color("Cyan2", "#00FFFF"),
            Color("Cyan2", "#00FFFF"),
            Color("Cyan2", "#00FFFF"),
        )
    }
}
