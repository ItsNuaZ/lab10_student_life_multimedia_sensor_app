package com.example.studentapp.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onCameraClick: () -> Unit,
    onMusicClick: () -> Unit,
    onVideoClick: () -> Unit,
    onSensorClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Student Life",
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(
            Modifier.height(32.dp)
        )
        Button(
            onClick = onCameraClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("📷 Camera Filter")
        }
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = onMusicClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("🎵 Music Player")
        }
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = onVideoClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("🎬 Video Player")
        }
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = onSensorClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("👟 Step Counter")
        }
    }
}
