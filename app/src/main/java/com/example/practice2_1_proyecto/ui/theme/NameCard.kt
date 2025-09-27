package com.example.practice2_1_proyecto.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice2_1_proyecto.R

@Composable
fun NameCard(

    name: String,
    title: String,
    @androidx.annotation.DrawableRes logoResId: Int,
    logoBackgroundColor: Color = Color(0xFF073042),
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(logoBackgroundColor)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = logoResId),
                contentDescription = "Logo",
                modifier = Modifier.size(80.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = title,
            fontSize = 16.sp,
            color = Color(0xFF00695C)
        )

    }
}


@Preview(showBackground = true, name = "NameCard Only Preview")
@Composable
fun NameCardIsolatedPreview() {
    Practice2_1_ProyectoTheme {
        NameCard(
            name = "Jennifer Doe",
            title = "Android Developer Extraordinaire",
            logoResId = R.drawable.android_logo
        )
    }
}


@Preview(showBackground = true, showSystemUi = true, name = "NameCard Centered on Screen")
@Composable
fun NameCardCenteredPreview() {
    Practice2_1_ProyectoTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            NameCard(
                name = "Jennifer Doe",
                title = "Android Developer Extraordinaire",
                logoResId = R.drawable.android_logo,
            )
        }
    }
}
