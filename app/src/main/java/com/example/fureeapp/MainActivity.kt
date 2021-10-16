package com.example.fureeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.fureeapp.ui.page.DetailPage
import com.example.fureeapp.ui.page.GettingStarted
import com.example.fureeapp.ui.page.HomePage
import com.example.fureeapp.ui.theme.FureeAppTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FureeAppTheme {
                // A surface container using the 'background' color from the theme
                GettingStarted()
            }
        }
    }
}

@ExperimentalPagerApi
@Preview
@Composable
fun DefaultPreview() {
    FureeAppTheme {
        GettingStarted()
    }
}
