package com.heschedule.grsmu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { App() }
    }
}

@Composable
private fun App() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF101014)),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "Каркас работает\nШаг 1 ок",
            color = Color(0xFFFF5252),
            fontSize = 22.sp,
            textAlign = TextAlign.Center,
        )
    }
}
