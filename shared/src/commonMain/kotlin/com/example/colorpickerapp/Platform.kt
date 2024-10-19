package com.example.colorpickerapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform