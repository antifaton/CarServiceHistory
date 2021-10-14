package com.carservice.history.android.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.carservice.history.Greeting
import com.carservice.history.android.ui.theme.MyApplicationTheme

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                mainView()
            }
        }
    }
}


@Composable
fun mainView() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = greet(), modifier = Modifier.align(Alignment.Center))
    }
}