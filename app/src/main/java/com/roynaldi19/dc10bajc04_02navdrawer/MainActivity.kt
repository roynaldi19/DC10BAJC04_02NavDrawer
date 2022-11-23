package com.roynaldi19.dc10bajc04_02navdrawer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.roynaldi19.dc10bajc04_02navdrawer.ui.theme.DC10BAJC04_02NavDrawerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DC10BAJC04_02NavDrawerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyNavDrawerApp()

                }
            }
        }
    }
}

@Composable
fun MyNavDrawerApp() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DC10BAJC04_02NavDrawerTheme {
        MyNavDrawerApp()
    }
}