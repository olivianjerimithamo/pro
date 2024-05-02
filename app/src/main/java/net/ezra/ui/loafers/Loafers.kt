package net.ezra.ui.loafers

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R
import net.ezra.navigation.ROUTE_SHOP

@Composable
fun Loafers(navController: NavHostController) {

    Column(

    ){
        LazyColumn {

            item {


                Box {
                    Row(

                    ) {



                        Card (
                            modifier = Modifier
                                //.border(1. dp, color = Color.DarkGray)
                                .padding(12.dp)
                        ){
                            Image(painter = painterResource(id = R.drawable.f), contentDescription = "")

                        }

                        Spacer(modifier = Modifier.width(15.dp))

                        Card {
                            Image(painter = painterResource(id = R.drawable.fer), contentDescription ="" )
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card {
                            Image(painter = painterResource(id = R.drawable.ffer), contentDescription ="",
                                modifier = Modifier
                                //.padding(10.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card {
                            Image(painter = painterResource(id = R.drawable.lo), contentDescription ="" )
                        }



                    }

                }
            }
        }





        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_SHOP) { inclusive = true }
                    }
                },
            text = "loafers",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )





    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    Loafers(rememberNavController())
}

