package com.example.practice2_1_proyecto.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview


    @Composable
    fun ContactCard(
                    tlfIcon: ImageVector,
                    tlfNum: String,
                    socialIcon: ImageVector,
                    contacto: String,
                    emailIcon: ImageVector,
                    correo: String,
                    modifier: Modifier = Modifier
    ) {
        Column(modifier=modifier) {
            ContactRow(icon = tlfIcon, text=tlfNum)
            ContactRow(icon = socialIcon, text=contacto)
            ContactRow(icon = emailIcon, text=correo)


        }

    }
    @Preview(showBackground = true)
    @Composable
    fun ContactCardPreviewIndividual() {
        Practice2_1_ProyectoTheme {
            ContactCard(
                tlfIcon = Icons.Filled.Call,
                tlfNum = "+11 (123) 444 555 666",
                socialIcon = Icons.Filled.Share,
                contacto = "@AndroidDev",
                emailIcon = Icons.Filled.Email,
                correo = "jen.doe@android.com"
            )

        }
    }
