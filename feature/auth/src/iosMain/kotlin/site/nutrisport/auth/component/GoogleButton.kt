package site.nutrisport.auth.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import site.nutrisport.shared.Resources
import site.nutrisport.shared.*
import org.jetbrains.compose.resources.DrawableResource

@Composable
fun GoogleButton(
    modifier: Modifier = Modifier,
    loading: Boolean = false,
    primaryText: String = "Sign in with Google",
    secondaryText: String = "Please wait...",
    icon: DrawableResource = Resources.Image.GoogleLogo,
    shape: Shape = RoundedCornerShape(size = 99.dp),
    backgroundColor: Color = Gray,
    borderColor: Color = GrayDarker,
    progressIndicatorColor: Color = IconSecondary,
    onClick: () -> Unit,
) {
    var buttonText by remember { mutableStateOf(primaryText) }

    LaunchedEffect(loading) {
        buttonText = if (loading) secondaryText else primaryText
    }

    Surface (modifier = modifier.clip(shape).border(width = 1.dp, color = borderColor, shape = shape).clickable(enabled = !loading) { onClick() }, color = backgroundColor) {}
}