package com.example.practice2_1_proyecto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.practice2_1_proyecto.ui.theme.Practice2_1_ProyectoTheme
import com.example.practice2_1_proyecto.ui.theme.BusinessCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practice2_1_ProyectoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
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
        }
    }
}
