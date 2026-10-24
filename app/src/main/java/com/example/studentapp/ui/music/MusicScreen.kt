package com.example.studentapp.ui.music

import android.media.MediaPlayer
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.studentapp.R

@Composable
fun MusicScreen() {
    val context = LocalContext.current
    val mediaPlayer = remember {
        MediaPlayer.create(context, R.raw.music)
    }
    var isPlaying by remember { mutableStateOf(false) }

    DisposableEffect(Unit) {
        onDispose {
            mediaPlayer?.release()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Student Music Player",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(Modifier.height(30.dp))
        Button(
            onClick = {
                mediaPlayer?.let {
                    if (it.isPlaying) {
                        it.pause()
                        isPlaying = false
                    } else {
                        it.start()
                        isPlaying = true
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(if (isPlaying) "Pause" else "Play")
        }
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = {
                mediaPlayer?.let {
                    it.pause()
                    it.seekTo(0)
                    isPlaying = false
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Stop")
        }
    }
}
