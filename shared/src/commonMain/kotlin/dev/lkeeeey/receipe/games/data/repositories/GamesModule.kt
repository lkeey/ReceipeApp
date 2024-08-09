package dev.lkeeeey.receipe.games.data.repositories

import dev.lkeeeey.receipe.games.api.repositories.GamesRepository
import ktor.KtorGamesDataSource
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.provider
import org.kodein.di.singleton

val gamesModule = DI.Module("gamesModule") {
    bind<KtorGamesDataSource>() with provider {
        KtorGamesDataSource(instance())
    }

    bind<GamesRepository>() with singleton {
        GamesRepositoryImpl(instance())
    }
}