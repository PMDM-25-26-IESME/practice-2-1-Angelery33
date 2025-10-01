package com.example.practice2_1_proyecto.ui.theme


import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practice2_1_proyecto.R


@Composable
fun BusinessCard(nom: String,tlf : String, con : String, mail : String, tit : String, logo: Int, modifier : Modifier = Modifier) {
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
                name = nom,
                title = tit,
                logoResId = logo,
                modifier = Modifier.padding(bottom = 24.dp,top=200.dp)
            )
            Spacer(modifier = Modifier.height(200.dp))



            ContactCard(
                tlfIcon = Icons.Filled.Call,
                tlfNum = tlf,
                socialIcon = Icons.Filled.Share,
                contacto = con,
                emailIcon = Icons.Filled.Email,
                correo = mail,

            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardLayoutVerticalPreview() {
    Practice2_1_ProyectoTheme {
        BusinessCard(
            "Angel Cantero",
            "+11 (123) 444 555 666",
            "@AndroidDev",
            "ang.cantero@android.com",
            "Android Developer Extraordinaire",
            R.drawable.android_logo,

        )
    }

}

