package com.uti.pjetpack

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uti.pjetpack.ui.theme.PJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //    Greeting("Android")
                    //    Text(text = "Coba Lagi")

//                    Text(text = "Coba Lagi")
                    DefaultPreview()

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PJetpackTheme {
//        Greeting("Android")
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(androidx.compose.ui.graphics.Color.Magenta)
        ) {
            //    Greeting("Android")
            //  Text(text = "Coba Lagi")
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(androidx.compose.ui.graphics.Color.Cyan)
                    .padding(10.dp)
            ) {
                Greeting("Arman")
                Text(text = "Coba Lagi")
            }

            Spacer(modifier = Modifier.padding(10.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(androidx.compose.ui.graphics.Color.Green)
                    .padding(10.dp)
            ) {
                Greeting("Arman ")
                Text(text = "Jalan - Jalan Ke kalianda, Jangan Lupa Membeli Martabak. Untuk apa ke kalianda cuma beli martabak")

                //  buat variabel untuk context
                var context = LocalContext.current

                //   buat button
                Button(onClick = {
                    //   isi even untuk click
                    //   buat variabel
                    //   val (immutable)
                    //   var (mutable)
                    var test = "Oke"
                    test = "Yes"
                    test = "Ya"

                    var nilai1 = 10
                    var nilai2 = 15
                    var nilai3 = nilai1.toFloat()/ nilai2


                    Toast.makeText(context,nilai3.toString(),Toast.LENGTH_SHORT).show();

                }, modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(
                    androidx.compose.ui.graphics.Color.Black)) {
                    //  isi teks pada button
                    Text(text = "proses", color = androidx.compose.ui.graphics.Color.Red)
                }
            }
        }

    }
}