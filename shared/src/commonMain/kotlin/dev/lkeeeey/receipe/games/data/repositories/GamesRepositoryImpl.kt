package dev.lkeeeey.receipe.games.data.repositories

import dev.lkeeeey.receipe.games.api.models.Game
import dev.lkeeeey.receipe.games.api.repositories.GamesRepository
import dev.lkeeeey.receipe.games.data.ktor.models.mapToGame
import ktor.KtorGamesDataSource


class GamesRepositoryImpl(
    private val remoteDataSource: KtorGamesDataSource
) : GamesRepository {

    override suspend fun fetchAllGames(): List<Game> {
//        return remoteDataSource.fetchAllGames().map { it.mapToGame() }

        return listOf(
            Game("1", "dota")
        )
    }

    override suspend fun searchGame(query: String): List<Game> {
//        return remoteDataSource.searchGame(query).map { it.mapToGame() }
        return listOf(
            Game("2", "aw")
        )
    }
}