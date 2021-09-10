package com.example.troposphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.troposphere.ui.theme.TroposphereTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TroposphereTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    TroposphereTheme {
        Text(text = "Mercedes")
    }
}