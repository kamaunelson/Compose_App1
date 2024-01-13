package com.example.compose_app1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_app1.ui.theme.Compose_App1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var count by remember {
                mutableStateOf(0)
            }
            Compose_App1Theme {
                Column (
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = count.toString(),
                        fontSize = 30.sp)
                    Button(onClick = { count++ }) {
                        Text(text = "Click me!!")
                    }
                }
            }
        }
    }
}
//in composable we create functions which change state so as to achieve desired
// output. Instead of setcontentview we have setcontent and instead of textview we
//have text in compose. we dont create variables in this case since we use states.
//modifiers are powerful tools for customizing and enhancing the appearance, behavior,
// and layout of UI elements

//column is a type of layout used to organize elements within the ui
//other layouts include Row, LazyColumn LazyRow, Box, ConstraintLayout, Surface and Scaffold
//Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription =null)
//Icon(imageVector = Icons.Default.Call, contentDescription = null)
//Text(text = "Hi! I am Mere!!!", modifier = Modifier.background(Color.Red))

// use the remember{} function so that incase of any changes in states the composed initial state
// is not re instated but the last value is remember in our tree ui element.
//we used state to declare values that can change state over time hence mutablestateof()
