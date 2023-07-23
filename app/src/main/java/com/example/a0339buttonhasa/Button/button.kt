package com.example.a0339buttonhasa.Button

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun button (){
    Button(
        onClick = { }) {
        Text(text = "button ")
    }
}
//@Composable
//fun button ( onClick: () -> Unit){
//    Button(
//        onClick = { onClick }) {
//          Text(text = "button ")
//    }
//}



@Preview( showSystemUi = false )
@Composable
fun preview (){
    button()
}