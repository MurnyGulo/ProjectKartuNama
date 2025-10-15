package com.example.project_kartunama

import com.example.project_kartunama.ui.theme.Project_KartuNamaTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_KartuNamaTheme {  }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFDDE6ED)
                ) {
                    Project_KartuNamaTheme {  }
                }
            }
        }

@Composable
fun Project_KartuNama() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF27374D))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Doraemon",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(
            text = "Android Developer",
            fontSize = 16.sp,
            color = Color(0xFFA5C9CA)
        )

        Spacer(modifier = Modifier.height(24.dp))

        ContactInfo()
    }
}

@Composable
fun ContactInfo() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "0812-3456-7890", color = Color.White, fontSize = 16.sp)
        Text(text = "doraemon@example.com", color = Color.White, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun Project_KartuNamaPreview() {
    Project_KartuNamaTheme { }
}
}

