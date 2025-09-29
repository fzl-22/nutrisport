package site.ahmadfaisal.nutrisport

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import site.ahmadfaisal.nutrisport.navigation.SetupNavGraph

@Composable
@Preview
fun App() {
    MaterialTheme {
        SetupNavGraph()
    }
}