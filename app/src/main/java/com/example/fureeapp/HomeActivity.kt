package com.example.fureeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.fureeapp.ui.page.DetailPage
import com.example.fureeapp.ui.page.GettingStarted
import com.example.fureeapp.ui.page.HomePage
import com.example.fureeapp.ui.theme.FureeAppTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class HomeActivity : AppCompatActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FureeAppTheme {
                // A surface container using the 'background' color from the theme
                HomePage()
            }
        }
    }
}

@ExperimentalMaterialApi
@Preview
@Composable
fun HomePreview() {
    FureeAppTheme {
        HomePage()
    }
}