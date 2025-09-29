package site.ahmadfaisal.nutrisport.auth

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import rememberMessageBarState
import ContentWithMessageBar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import site.ahmadfaisal.nutrisport.auth.component.GoogleButton
import site.ahmadfaisal.nutrisport.shared.Alpha
import site.ahmadfaisal.nutrisport.shared.FontSize
import site.ahmadfaisal.nutrisport.shared.Surface
import site.ahmadfaisal.nutrisport.shared.TextPrimary
import site.ahmadfaisal.nutrisport.shared.TextSecondary
import site.ahmadfaisal.nutrisport.shared.bebasNeueFont

@Composable
fun AuthScreen() {
    val messageBarState = rememberMessageBarState()
    var loadingState by remember { mutableStateOf(false) }

    Scaffold { paddingValues ->
        ContentWithMessageBar(
            contentBackgroundColor = Surface,
            modifier = Modifier.padding(
                top = paddingValues.calculateTopPadding(),
                bottom = paddingValues.calculateBottomPadding(),
            ),
            messageBarState = messageBarState,
            errorMaxLines = 2,
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
                    .padding(all = 24.dp),
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "NUTRISPORT",
                        textAlign = TextAlign.Center,
                        fontFamily = bebasNeueFont(),
                        fontSize = FontSize.EXTRA_LARGE,
                        color = TextSecondary,
                    )
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .alpha(Alpha.HALF),
                        text = "Sign in to continue",
                        textAlign = TextAlign.Center,
                        fontSize = FontSize.EXTRA_REGULAR,
                        color = TextPrimary,
                    )
                }
                GoogleButton(
                    loading = false,
                    onClick = {}
                )
            }
        }

    }
}