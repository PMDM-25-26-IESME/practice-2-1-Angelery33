package com.example.practice2_1_proyecto.ui.theme


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practice2_1_proyecto.R


@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color(0xFFE0F2F1)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            NameCard(
                name = "Angelery Cantero",
                title = "Android Developer Extraordinaire",
                logoResId = R.drawable.android_logo,
                modifier = Modifier.padding(bottom = 24.dp,top=200.dp)
            )
            Spacer(modifier = Modifier.height(200.dp))



            ContactCard(
                tlfIcon = Icons.Filled.Call,
                tlfNum = "+11 (123) 444 555 666",
                socialIcon = Icons.Filled.Share,
                contacto = "@AngelDev",
                emailIcon = Icons.Filled.Email,
                correo = "ang.cantero@android.com",

            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardLayoutVerticalPreview() {
    Practice2_1_ProyectoTheme {
        BusinessCard()
    }

}

