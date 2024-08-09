package dev.lkeeeey.receipe

import android.app.Application
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import receipeapp.composeapp.generated.resources.Res


class PlApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}

fun PlayzoneApp.initPlatformSDK() =
    PlatformSDK.init(
        configuration = PlatformConfiguration(androidContext = applicationContext)
    )