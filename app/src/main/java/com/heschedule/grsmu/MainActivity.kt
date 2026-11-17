package com.heschedule.grsmu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { App() }
    }
}

@Composable
private fun App() {
    MaterialTheme {
        Scaffold { padding ->
            Text(
                text = stringResource(R.string.app_name),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineMedium,
            )
        }
    }
}
