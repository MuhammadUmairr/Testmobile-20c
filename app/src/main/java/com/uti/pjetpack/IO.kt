package com.uti.pjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uti.pjetpack.ui.theme.PJetpackTheme

class IO : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                  buat area layout column
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)) {

//                  buat objek textfield
                        OutlinedTextField(label = {
                                          Text(text = "Isi Nilai 1")
                        },value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth(), colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent, focusedIndicatorColor = Color.Blue, unfocusedIndicatorColor = Color.Red, focusedLabelColor =
                            colorResource(id = R.color.warna1)))
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    PJetpackTheme {

    }
}