package com.example.fureeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.fureeapp.ui.page.DetailPage
import com.example.fureeapp.ui.page.HomePage
import com.example.fureeapp.ui.theme.FureeAppTheme

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FureeAppTheme {
                // A surface container using the 'background' color from the theme
                DetailPage()
            }
        }
    }
}

@Preview
@Composable
fun DetailPreview() {
    DetailPage()
}