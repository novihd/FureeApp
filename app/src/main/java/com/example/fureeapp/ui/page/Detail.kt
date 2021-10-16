package com.example.fureeapp.ui.page

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.fureeapp.R
import com.example.fureeapp.ui.theme.*

@Preview
@Composable
fun DetailPage() {

    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .background(White)
            .verticalScroll(scrollState)
    ) {
        ImageDetail()
        User()
        Description()
        SelectSize()
        ButtonAdd()
    }

}

@Composable
fun ImageDetail() {
    Card(modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth()
        .height(350.dp), shape = RoundedCornerShape(16.dp)) {
        Box {
            Image(painter = painterResource(id = R.drawable.img1), contentDescription = "Clothes", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
            Icon(painter = painterResource(id = R.drawable.ic_baseline_keyboard_backspace_24), contentDescription = "jj", modifier = Modifier
                .padding(16.dp)
                .align(Alignment.TopStart))
            Row(horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.Top, modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
                Icon(painter = painterResource(id = R.drawable.ic_baseline_favorite_border_24), contentDescription = "Favorite")
                Icon(painter = painterResource(id = R.drawable.ic_baseline_shopping_bag_24), contentDescription = "Cart", modifier = Modifier.padding(start = 8.dp))
            }
            Column(modifier = Modifier
                .padding(16.dp)
                .width(60.dp)
                .align(Alignment.BottomEnd)) {
                Image(painter = painterResource(id = R.drawable.img1), contentDescription = "Image 1",
                    Modifier
                        .padding(8.dp)
                        .clip(CircleShape)
                        .border(2.dp, White, CircleShape))
                Image(painter = painterResource(id = R.drawable.img1), contentDescription = "Image 1",
                    Modifier
                        .padding(8.dp)
                        .clip(CircleShape)
                        .border(2.dp, White, CircleShape))
                Image(painter = painterResource(id = R.drawable.img1), contentDescription = "Image 1",
                    Modifier
                        .padding(8.dp)
                        .clip(CircleShape)
                        .border(2.dp, White, CircleShape))
            }
        }
    }
}

@Composable
fun User() {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(16.dp, 8.dp)) {
        OutlinedButton(onClick = { },
            modifier= Modifier.size(50.dp),
            shape = CircleShape,
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor =  SkyBlue, backgroundColor = SkyBlue)
        ) {
            Text(text = "U", style = MaterialTheme.typography.body1, color = White)
        }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = "Ucito apparel", style = MaterialTheme.typography.h3)
            Text(text = "Official Store", style = MaterialTheme.typography.body1)
        }
        Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
            ButtonFollow()
        }
    }

}

@Composable
fun ButtonFollow() {
    Card(
        shape = RoundedCornerShape(32.dp),
        backgroundColor = White,
        border = BorderStroke(width = 0.5.dp, color = Green)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_check_circle_24),
                contentDescription = "Follow",
                modifier = Modifier
                    .size(28.dp)
                    .padding(start = 8.dp)
            )
            Text(
                text = "Following",
                style = MaterialTheme.typography.body1,
                color = Green,
                modifier = Modifier.padding(8.dp, 0.dp)
            )
        }
    }
}

@Composable
fun Description() {
    Column(modifier = Modifier.padding(16.dp, 8.dp)) {
        Text(text = "Sweater Cream", style = MaterialTheme.typography.h1)
        Text(
            text = "Clothing that is very comfortable to use for daily activities and is not hot.",
            style = MaterialTheme.typography.body1,
            color = Gray
        )
        Text(text = "Read More.", style = MaterialTheme.typography.body1, color = Orange)
    }
}

@Composable
fun SelectSize() {
    Column(modifier = Modifier.padding(16.dp, 8.dp)) {
        Text(text = "Select Size", style = MaterialTheme.typography.h1)
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.width(230.dp)
        ) {
            OutlinedButton(onClick = { },
                modifier= Modifier.size(50.dp),
                shape = CircleShape,
                border= BorderStroke(0.5.dp, Gray),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor =  Gray)
            ) {
                Text(text = "S", style = MaterialTheme.typography.body1, color = Gray)
            }
            OutlinedButton(onClick = { },
                modifier= Modifier.size(50.dp),
                shape = CircleShape,
                border= BorderStroke(0.5.dp, Gray),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor =  Gray)
            ) {
                Text(text = "M", style = MaterialTheme.typography.body1, color = Gray)
            }
            OutlinedButton(onClick = { },
                modifier= Modifier.size(50.dp),
                shape = CircleShape,
                border= BorderStroke(0.5.dp, Gray),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor =  Gray)
            ) {
                Text(text = "L", style = MaterialTheme.typography.body1, color = Gray)
            }
            OutlinedButton(onClick = { },
                modifier= Modifier.size(50.dp),
                shape = CircleShape,
                border= BorderStroke(0.5.dp, Gray),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor =  Gray)
            ) {
                Text(text = "XL", style = MaterialTheme.typography.body1, color = Gray)
            }
        }

    }
}

@Composable
fun ButtonAdd() {
    Button(
        onClick = { },
        shape = RoundedCornerShape(32.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Blue),
        modifier = Modifier
            .padding(16.dp, 8.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "$140.00",
                style = MaterialTheme.typography.body1,
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "|",
                style = MaterialTheme.typography.body1,
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "Add to chart",
                style = MaterialTheme.typography.body1,
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

