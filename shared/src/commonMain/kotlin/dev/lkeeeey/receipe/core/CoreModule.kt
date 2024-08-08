package dev.lkeeeey.receipe.core

import dev.lkeeeey.receipe.core.json.serializationModule
import ktor.ktorModule
import org.kodein.di.DI

val coreModule = DI.Module("coreModule") {
    importAll(
        serializationModule,
        ktorModule
    )
}