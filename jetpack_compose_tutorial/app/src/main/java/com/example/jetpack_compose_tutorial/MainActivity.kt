package com.example.jetpack_compose_tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_tutorial.ui.theme.Jetpack_compose_tutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack_compose_tutorialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {

                }
            }
        }
    }
}

@Composable
fun Redaction(title: String, message1: String, message2: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            lineHeight = 59.sp
        )
        Text(
            text = message1
        )
        Text(
            text = message2
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PresentationPreview() {
    Jetpack_compose_tutorialTheme {
        Redaction(
            title = "Jetpack Compose tutorial",
            message1 = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            message2 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    }
}