package com.example.felizcumpleanos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.felizcumpleanos.ui.theme.FelizCumpleanosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FelizCumpleanosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                MensajeSaludo(mensaje = "Feliz Cumpleaños Bro", de = "De: R.A.M.O")
                }
            }
        }
    }
}

@Composable
fun MensajeSaludo(mensaje : String, de : String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = mensaje,
            fontSize = 60.sp,
            lineHeight = 70.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = de,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun ImagenSaludo(mensaje: String,de: String, modifier: Modifier = Modifier){

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TarjetaCumpleanosVista() {
    FelizCumpleanosTheme {
        MensajeSaludo(mensaje = "Feliz Cumpleaños Bro", de = "De: R.A.M.O")
    }
}