package net.ezra.ui.home

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.graphics.drawable.Icon
//import android.util.Size.
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.size.Size
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_BOOTS
import net.ezra.navigation.ROUTE_HEELS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOAFERS
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_SHOP

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Shoe Designs", color = Color.Magenta)
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.ShoppingCart, "backIcon")
                    }
                },


                )
            
        },
        content = {
            Column(
                modifier = Modifier
                    .background(color = Color.LightGray)
                    .fillMaxSize()
                //  .background(Color(0xff8d6e63)),
                // verticalArrangement = Arrangement.Center,
                //  horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(15.dp))





                   Button(onClick = {}) {
                       Image(
                           painterResource(id = R.drawable.cart),
                           contentDescription ="Cart button icon",
                           modifier = Modifier.size(20.dp))

                       Text(text = "boots",Modifier.padding(start = 10.dp))


                   }
                Row {
                    Button(onClick = {  }) {
                        Text(text = "About")
                    }

                    Button(onClick = {  }) {
                        Text(text = "Shop")
                    }

                    Button(onClick = {  }) {
                        Text(text = "Log in")
                    }
                }





                Spacer(modifier = Modifier.height(19.dp))




                Text(text = "Hello,let me know the type of shoe you want", color = Color.Blue)

                IconButton(onClick = { }) {
                    Icon(Icons.Filled.Search,"view more")


                }

                Spacer(modifier = Modifier.height(15.dp))

                LazyRow {
                    item {
                        Box {
                            Card {
                                Image(painter = painterResource(id = R.drawable.el), contentDescription ="Shop now !!!" )
                            }
                            Spacer(modifier = Modifier.width(150.dp))
                       }
                        Box {
                            Card {
                                Image(painter = painterResource(id = R.drawable.img_1), contentDescription ="" )
                            }
                        }
                        Spacer(modifier = Modifier.width(50.dp))

                        Box {
                            Card {
                                Image(painter = painterResource(id = R.drawable.two), contentDescription ="" )
                            }
                        }

                    }

                }
                
                IconButton(onClick = { }) {
                    Icon(Icons.Filled.Menu,"view more")
                    

                }
                
                
                Box {
                    Text(text = "Go Get It Now!!1")
                    
                }
                







                Image(painter = painterResource(id = R.drawable.sho
                ), contentDescription ="",
                   modifier = Modifier
                       //.fillMaxSize()
                       .fillMaxHeight()
                       .fillMaxWidth()


                )









            }

        },
        bottomBar = { net.ezra.ui.services.BottomBar() }
    )


}

@Composable
fun BottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home, "")
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite, "")
        },
            label = { Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Call, "")
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }
}

           
       
//    Column (
//        modifier = Modifier
//            .fillMaxSize()
//    ){
//        Image(painter = painterResource(id = R.drawable.shop), contentDescription ="" )
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_HOME) {
//                        popUpTo(ROUTE_SHOP) { inclusive = true }
//                    }
//                },
//            text = "SHOP", color = Color(0xff23D342)
//        )
//    }
//






@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

