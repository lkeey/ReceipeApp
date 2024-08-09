package dev.lkeeeey.receipe.games.api.repositories

import dev.lkeeeey.receipe.games.api.models.Game


interface GamesRepository {
    suspend fun fetchAllGames(): List<Game>
    suspend fun searchGame(query: String): List<Game>
}