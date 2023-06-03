package com.example.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecard.ui.theme.NameCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCard(name = "HAMADA", title = "UoA29")
                }
            }
        }
    }
}

@Composable
fun NameCard(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.img_0459)
    Column(
        modifier = modifier
            .background(Color(0xFFEADDFF)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = image, contentDescription = null, modifier = modifier.padding(48.dp))
        Text(
            text = name,
            modifier = modifier,
            fontSize = 35.sp,
            color = Color.Black
        )
        Text(
            text = title,
            modifier = modifier,
            fontSize = 20.sp,
            color = Color.Blue
        )
    }
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                modifier = Modifier.offset(y = 502.dp)
            )
            Text(
                text = "###-####-####",
                modifier = Modifier.offset(y = 500.dp),
                fontSize = 20.sp
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                modifier = Modifier.offset(y = 532.dp)
            )
            Text(
                text = "@AHMOS_HMD",
                modifier = Modifier.offset(y = 530.dp),
                fontSize = 20.sp
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                modifier = Modifier.offset(y = 562.dp)
            )
            Text(
                text = "email@domain.com",
                modifier = Modifier.offset(y = 560.dp),
                fontSize = 20.sp

            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun NameCardPreview() {
    NameCardTheme {
        NameCard("HAMADA Shoma", "UoA29")
    }
}