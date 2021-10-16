package com.example.fureeapp.ui.page

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fureeapp.HomeActivity
import com.example.fureeapp.ui.theme.Blue
import com.google.accompanist.coil.rememberCoilPainter
import com.google.accompanist.pager.ExperimentalPagerApi

@Preview
@ExperimentalPagerApi
@Composable
fun GettingStarted() {

    val gettingImg =
        "https://www.givenchy.com/on/demandware.static/-/Library-Sites-shared_GIV_Library/default/dw76e02fed/Content/Collections/FW21/Fall21/Gallery/F21-Preco-Gallery-Background-03.jpg"

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = rememberCoilPainter(request = gettingImg),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                TextGreeting()
                ButtonStarted()
            }
        }
    }
}

@Preview
@Composable
fun TextGreeting() {
    Column (modifier = Modifier.padding(4.dp)){
        Text(
            text = "Find your best outfit and look great",
            style = MaterialTheme.typography.h1,
            color = Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(40.dp, 4.dp)
        )

        Text(
            text = "Shop here and get benefits and quality goods",
            style = MaterialTheme.typography.body1,
            color = Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(40.dp, 4.dp)
        )
    }


}

@Composable
fun ButtonStarted() {
    val context = LocalContext.current
    Button(
        onClick = { context.startActivity(Intent(context, HomeActivity::class.java)) },
        shape = RoundedCornerShape(32.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Blue),
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Get Started",
            style = MaterialTheme.typography.body1,
            color = Color.White,
            modifier = Modifier.padding(8.dp)
        )
    }
}




