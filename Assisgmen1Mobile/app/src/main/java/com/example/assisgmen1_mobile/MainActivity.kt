package com.example.assisgmen1_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assisgmen1_mobile.ui.theme.Assisgmen1MobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assisgmen1MobileTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}




@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column {
        Column (horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = modifier.fillMaxWidth().weight(2f)){
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "AndroidLogo",
                modifier = modifier.width(100.dp).background(Color(red = 0, green = 0, blue = 25 ))
            )
            Text(text = "Alan Freitas", fontSize = 40.sp)
            Text (modifier = modifier.padding( vertical = 10.dp), text = "Software Development Student", color = Color(red = 0, green = 90, blue = 0 ), fontWeight = FontWeight.Bold)
        }
        Column ( modifier = modifier.fillMaxWidth().weight(1f).padding(50.dp)) {
            Row  (modifier = modifier.padding( vertical = 5.dp)) {
                Icon(imageVector = Icons.Filled.Call, contentDescription = "Phone", modifier = modifier.padding(horizontal = 25.dp), tint = Color(red = 0, green = 120, blue = 0 ) )
                Text(text = "+1 (403) 333 2693")
            }
            Row (modifier = modifier.padding( vertical = 5.dp)){
                Icon(imageVector = Icons.Filled.Share, contentDescription = "Share", modifier = modifier.padding(horizontal = 25.dp), tint = Color(red = 0, green = 120, blue = 0 ))
                Text(text = "@AlanDev")
            }
            Row (modifier = modifier.padding( vertical = 5.dp)){
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Mail", modifier = modifier.padding(horizontal = 25.dp), tint = Color(red = 0, green = 120, blue = 0 ))
                Text(text = "alanhpfreitas@hotmail.com")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assisgmen1MobileTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            Greeting()
        }
    }
}