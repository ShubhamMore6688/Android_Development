package com.example.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.list.ui.theme.ListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val scroll = rememberScrollState()
//            Column(modifier = Modifier
//                .fillMaxSize()
//                .verticalScroll(scroll)
//
//            ) {
//                for (i in 1..50){
//                    Text(
//                        text = "Item $i",
//                        textAlign = TextAlign.Center,
//                        fontWeight = FontWeight.Bold,
//                        fontSize = 24.sp,
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(24.dp)
//
//                    )
//                }
//            }
            
            LazyColumn{
                items(5000){
                    Text(
                        text = "Item $it",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp)
                        )
                }
            }
        }
    }
}
