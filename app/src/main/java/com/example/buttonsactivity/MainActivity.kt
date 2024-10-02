package com.example.buttonsactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buttonsactivity.ui.theme.ButtonsActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonsActivityTheme {

                ButtonsApp()

        }
    }
}

@Composable
fun ButtonsApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { /* TODO */ }, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EA))) {
            Text("Filled Button", color = Color.White)
        }

        FilledTonalButton(onClick = { /* TODO */ }, colors = ButtonDefaults.filledTonalButtonColors(containerColor = Color(0xFFBB86FC))) {
            Text("Tonal Button", color = Color.Black)
        }

        OutlinedButton(onClick = { /* TODO */ }, colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF018786))) {
            Text("Outlined Button")
        }

        ElevatedButton(onClick = { /* TODO */ }, colors = ButtonDefaults.elevatedButtonColors(containerColor = Color(0xFFA2133D))) {
            Text("Elevated Button")
        }

        TextButton(onClick = { /* TODO */ }, colors = ButtonDefaults.textButtonColors(contentColor = Color(0xFF615D6B))) {
            Text("Text Button")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonsActivity() {
    ButtonsActivityTheme {
        ButtonsApp()
    }
}}