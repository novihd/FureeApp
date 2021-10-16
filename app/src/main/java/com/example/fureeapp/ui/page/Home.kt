package com.example.fureeapp.ui.page

import android.content.Intent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fureeapp.DetailActivity
import com.example.fureeapp.R
import com.example.fureeapp.ui.theme.*

@ExperimentalMaterialApi
@Composable
@Preview
fun HomePage() {
    Scaffold(topBar = { TopAppBar() }, bottomBar = { BottomNav() }) {
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .background(White)
                .padding(horizontal = 16.dp)
                .verticalScroll(scrollState)
        ) {
            CardSearch()
            Category()
            Categories()
            NewArrival()
            ListNewArrivals()
        }
    }
}

@Preview
@Composable
fun TopAppBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_baseline_menu_24), contentDescription = "Navigation", tint = Gray)
        Icon(painter = painterResource(id = R.drawable.ic_baseline_shopping_bag_24), contentDescription = "Navigation", tint = Gray)
    }
}

@Composable
fun CardSearch() {
    Card(
        shape = RoundedCornerShape(16.dp),
        backgroundColor = SkyBlue,
        modifier = Modifier.padding(top = 8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp,8.dp)
        ) {
            Text(
                text = "Find the best clothes for you",
                style = MaterialTheme.typography.h1,
                color = Blue,
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .width(240.dp)
            )

            val (value, onValueChange) = remember { mutableStateOf("") }

            TextField(
                value = value,
                onValueChange = onValueChange,
                leadingIcon = { Icon(Icons.Filled.Search, "SearchView", tint = Gray) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = White, RoundedCornerShape(16.dp)),
                placeholder = { Text(text = "Search your clothes", style = MaterialTheme.typography.body1, color = Gray) },
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    cursorColor = Color.DarkGray
                )
            )
        }
    }
}

@Composable
fun Category() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Text(text = "Categories", style = MaterialTheme.typography.h1, color = Black)
        Text(text = "View All",
            style = MaterialTheme.typography.body1,
            color = Orange,
            )
    }
}

@Composable
fun Categories() {
    val scrollState = rememberScrollState()
    Row(
        Modifier.horizontalScroll(scrollState)
    ) {
        Card(
            shape = RoundedCornerShape(32.dp),
            backgroundColor = White,
            border = BorderStroke(width = 0.5.dp, color = Grey),
            modifier = Modifier.width(120.dp)
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.clothes),
                    contentDescription = "Clothes",
                    modifier = Modifier
                        .size(28.dp)
                        .padding(start = 8.dp)
                )
                Text(
                    text = "Clothes",
                    style = MaterialTheme.typography.h2,
                    color = Gray,
                    modifier = Modifier.padding(8.dp, 0.dp)
                )
            }
        }

        Card(
            shape = RoundedCornerShape(32.dp),
            backgroundColor = White,
            border = BorderStroke(width = 0.5.dp, color = Grey),
            modifier = Modifier
                .padding(start = 16.dp)
                .width(120.dp)
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.shoes),
                    contentDescription = "Shoes",
                    modifier = Modifier
                        .size(28.dp)
                        .padding(start = 8.dp)
                )
                Text(
                    text = "Shoes",
                    style = MaterialTheme.typography.h2,
                    color = Gray,
                    modifier = Modifier.padding(8.dp, 0.dp)
                )
            }
        }

        Card(
            shape = RoundedCornerShape(32.dp),
            backgroundColor = White,
            border = BorderStroke(width = 0.5.dp, color = Grey),
            modifier = Modifier
                .padding(start = 16.dp)
                .width(120.dp)
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.bag),
                    contentDescription = "Bags",
                    modifier = Modifier
                        .size(28.dp)
                        .padding(start = 8.dp)
                )
                Text(
                    text = "Bags",
                    style = MaterialTheme.typography.h2,
                    color = Gray,
                    modifier = Modifier.padding(8.dp, 0.dp)
                )
            }
        }

    }
}

@Composable
fun NewArrival() {
    Text(text = "New Arrivals", style = MaterialTheme.typography.h1, color = Black, modifier = Modifier.padding(0.dp, 8.dp))
}

@ExperimentalMaterialApi
@Preview
@Composable
fun ListNewArrivals() {
    val context = LocalContext.current
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Column {
                Card(
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .height(150.dp)
                        .width(170.dp),
                    onClick = {context.startActivity(Intent(context, DetailActivity::class.java))}
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img1),
                        contentDescription = "Clothes",
                        contentScale = ContentScale.Crop
                    )
                }
                Text(text = "Sweater Cream", style = MaterialTheme.typography.h2)
                Text(text = "$120.00")
            }
            Column {
                Card(
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .height(150.dp)
                        .width(170.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img2),
                        contentDescription = "Clothes",
                        contentScale = ContentScale.Crop
                    )
                }
                Text(text = "Black Blouse in Silk", style = MaterialTheme.typography.h2)
                Text(text = "$140.00")
            }

        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Column {
                Card(
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .height(150.dp)
                        .width(170.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img3),
                        contentDescription = "Clothes",
                        contentScale = ContentScale.Crop
                    )
                }
                Text(text = "Frilled Blouse in Silk", style = MaterialTheme.typography.h2)
                Text(text = "$140.00")
            }
            Column {
                Card(
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .height(150.dp)
                        .width(170.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img4),
                        contentDescription = "Clothes",
                        contentScale = ContentScale.Crop
                    )
                }
                Text(text = "T-Shirt", style = MaterialTheme.typography.h2)
                Text(text = "$100.00")
            }

        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Column {
                Card(
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .height(150.dp)
                        .width(170.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img3),
                        contentDescription = "Clothes",
                        contentScale = ContentScale.Crop
                    )
                }
                Text(text = "Frilled Blouse in Silk", style = MaterialTheme.typography.h2)
                Text(text = "$140.00")
            }
            Column {
                Card(
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .height(150.dp)
                        .width(170.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img4),
                        contentDescription = "Clothes",
                        contentScale = ContentScale.Crop
                    )
                }
                Text(text = "T-Shirt", style = MaterialTheme.typography.h2)
                Text(text = "$100.00")
            }

        }
    }
}

@Preview
@Composable
fun BottomNav() {
    BottomNavigation(
        backgroundColor = Color.White,
    ) {
        BottomNavigationItem(modifier = Modifier.fillMaxWidth(), selected = false, onClick = {  }, selectedContentColor = Blue, unselectedContentColor = Gray, icon =  {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp, 16.dp)
            )
            {
                Icon(
                    painter = painterResource(id = R.drawable.ic_outline_home_24),
                    contentDescription = "bag",
                    modifier = Modifier.padding(8.dp, 0.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_favorite_border_24),
                    contentDescription = "bag",
                    modifier = Modifier.padding(8.dp, 0.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_notifications_none_24),
                    contentDescription = "bag",
                    modifier = Modifier.padding(8.dp, 0.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_person_outline_24),
                    contentDescription = "bag",
                    modifier = Modifier.padding(8.dp, 0.dp)
                )
            }
        })
    }
}

