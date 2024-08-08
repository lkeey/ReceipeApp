package dev.lkeeeey.receipe

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform