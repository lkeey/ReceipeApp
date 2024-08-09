package dev.lkeeeey.receipe.`umbrella-core`

import dev.lkeeeey.receipe.core.configs.PlatformConfiguration
import dev.lkeeeey.receipe.core.coreModule
import dev.lkeeeey.receipe.core.di.Inject
import dev.lkeeeey.receipe.games.data.repositories.gamesModule
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.direct
import org.kodein.di.singleton

object PlatformSDK {

    fun init(
        configuration: PlatformConfiguration
    ) {
        val umbrellaModule = DI.Module(
            name = "umbrella",
            init = {
                bind<PlatformConfiguration>() with singleton { configuration }
            }
        )

        Inject.createDependencies(
            DI {
                importAll(
                    umbrellaModule,
                    coreModule,
                    gamesModule
                )
            }.direct
        )
    }
}