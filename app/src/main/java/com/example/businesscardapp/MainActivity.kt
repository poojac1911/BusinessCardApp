package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import com.example.businesscardapp.ui.theme.Pink40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEFB8C8)
                ) {
                    GreetingProfile("Pooja","Android")
                    ContactInfo()
                }
            }
        }
    }
}

@Composable
fun GreetingProfile(name: String, title: String) {
    val img = painterResource(id = R.drawable.ic_launcher_foreground)
    Column(
        Modifier
            .padding(top = 24.dp)
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = img ,
            contentDescription = "android",
            Modifier.background(Pink40)
        )
        Text(
            text = name,
            fontSize = 40.sp
        )
        Text(
            text = title,
            color = Pink40,
            fontSize = 16.sp
        )
    }
}

@Composable
fun ContactInfo() {
    Column(
        Modifier
            .padding(8.dp, bottom = 16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Icon(
                Icons.Rounded.Call,
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(18.dp))
            Text(
                text = "+000 1231231234",
                fontSize = 16.sp
            )
        }
        Row {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(18.dp))
            Text(
                text = "@poojac1911.com",
                fontSize = 16.sp
            )
        }
        Row {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(18.dp))
            Text(
                text = "email@gmail.com",
                fontSize = 16.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        GreetingProfile("Pooja","Android")
    }
}
@Preview(showBackground = true)
@Composable
fun ContactInfoPreview() {
    BusinessCardAppTheme {
        ContactInfo()
    }
}