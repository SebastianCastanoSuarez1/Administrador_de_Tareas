package com.example.administradordetareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.administradordetareas.ui.theme.AdministradorDeTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdministradorDeTareasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("All task completed","Nice work")
                }
            }
        }
    }
}

@Composable
fun Greeting(texto1: String,texto2: String, modifier: Modifier = Modifier) {
  Column(verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally) {
      Text(
          text = texto1,
          modifier = modifier.padding(bottom = 8.dp, top = 24.dp),
          textAlign = TextAlign.Center,
          fontWeight = FontWeight.Bold
      )
      Text(
          text = texto2,
          modifier = modifier,
          textAlign = TextAlign.Center,
          fontSize=16.sp
      )
      }
  }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AdministradorDeTareasTheme {
        Column {
            GreetingImage()

        }
    }
}
@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
val image= painterResource(R.drawable.ic_task_completed)
    Column(modifier=modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = image, contentDescription = null)
        Greeting(texto1 = "All task completed", texto2 = "Nice work!",modifier=modifier.padding(8.dp))
    }
}