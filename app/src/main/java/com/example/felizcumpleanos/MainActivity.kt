package com.example.felizcumpleanos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    ImagenSaludo(getString(R.string.feliz_cumpleanos_text), getString(
                        R.string.firma_text
                    ))
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
            fontSize = 55.sp,
            lineHeight = 70.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = de,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun ImagenSaludo(mensaje: String,de: String, modifier: Modifier = Modifier){
    val imagen = painterResource(R.drawable.androidfiesta)
    Box {
        Image(
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        MensajeSaludo(
            mensaje = mensaje,
            de = de,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TarjetaCumpleanosVista() {
    FelizCumpleanosTheme {
        ImagenSaludo( stringResource(R.string.feliz_cumpleanos_text),
            stringResource(R.string.firma_text)
        )
    }
}