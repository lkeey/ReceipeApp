package dev.lkeeeey.receipe.games.data.ktor.models

import dev.lkeeeey.receipe.games.api.models.Game
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class KtorSearchGame(
    @SerialName("gameID") val gameId: String,
    @SerialName("title") val title: String,
    @SerialName("description") val description: String,
    @SerialName("version") val version: String,
    @SerialName("size") val size: String,
)

fun KtorSearchGame.mapToGame(): Game =
    Game(
        id = gameId,
        title = title
    )