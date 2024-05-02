package net.ezra.ui.about

import android.content.res.Configuration
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme



@Composable
fun AboutScreen(navController: NavHostController) {

Column {
    Text(text = "Your Final Search Ends Here!!")
    Spacer(modifier = Modifier.height(15.dp))
    LazyColumn {

        item {


            Box {
                Row {



                    Card (){
                        Image(painter = painterResource(id = R.drawable.l), contentDescription = "")

                    }

                    Spacer(modifier = Modifier.width(25.dp))

                    Card {
                        Image(painter = painterResource(id = R.drawable.img_1), contentDescription ="" )
                    }
                    Spacer(modifier = Modifier.width(25.dp))

                    Card {
                        Image(painter = painterResource(id = R.drawable.fer), contentDescription ="",
                            modifier = Modifier
                            //.padding(10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(25.dp))
                    Card {
                        Image(painter = painterResource(id = R.drawable.one), contentDescription ="" )
                    }

                }

            }
        }
    }





    

}



    

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

