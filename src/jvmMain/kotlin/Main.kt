// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState


fun main() = application {
    Window(
        title = "软件版本更新",
        resizable = false,
        state = rememberWindowState(width = 1000.dp, height = 800.dp),
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}
