package com.example.composeapp

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontfamily = FontFamily(
            Font(R.font.lobster_regular, FontWeight.Thin)
        )
        setContent {

            Row(modifier = Modifier.height(500.dp)) {
                val painter = painterResource(id = R.drawable.kermit)
                val painter1 = painterResource(id = R.drawable.tom)
                val description = "Kermit is playing in Snow"
                val title = "Kermit is playing in Snow"
                Box(modifier = Modifier
                    .fillMaxSize(0.5f)
                    .padding(15.dp)
                    .clickable {

                    }
                ){
                    ImageCard(painter = painter, contentDescription = description, title = title)
                }

                Box(modifier = Modifier
                    .fillMaxSize(1f)
                    .padding(15.dp)
                    .clickable {  }
                ){
                    ImageCard(painter = painter1, contentDescription = description, title = title)
                }
            }





//            val painter = painterResource(id = R.drawable.kermit)
//            val description = "Kermit play in snow"
//            val title = "Kermit play in snow"
//            Box(modifier = Modifier
//                .fillMaxSize(0.5f)
//                .padding(20.dp)) {
//                ImageCard(painter = painter, contentDescription = description, title = title)
//            }

        }
    }
}
@Composable
fun ImageCard(
    painter: Painter,
    contentDescription : String,
    title : String
){
    Card(modifier = Modifier
        .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp)
    ) {
        Box(modifier = Modifier
           
            .height(200.dp)

        ){
            Image(painter = painter, contentDescription = contentDescription, contentScale = ContentScale.Crop)
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ), 300f
                    )
                )
            )
            Box(modifier = Modifier
                .padding(5.dp)
                .fillMaxSize(),
                contentAlignment = Alignment.BottomStart
            ){
                Text(text = title, style = androidx.compose.ui.text.TextStyle(color = Color.White, fontSize = 16.sp))
            }

        }
    }

}





//fun ImageCard(
//    painter: Painter,
//    contentDescription : String,
//    title : String,
//    modifier: Modifier = Modifier
//
//){
//Card (
//    modifier = Modifier.fillMaxWidth(),
//    shape = RoundedCornerShape(15.dp),
//    elevation = 5.dp
//)
//{
//    Box(modifier = modifier.height(200.dp))
//    {
//       Image(painter = painter, contentDescription = contentDescription, contentScale = ContentScale.Crop )
//        Box(modifier = Modifier
//            .fillMaxSize()
//            .background(brush = Brush.verticalGradient(
//                colors = listOf(
//                    Color.Transparent,
//                    Color.Black
//                ),
//                startY = 300f
//            ))
//        )
//        Box(modifier = Modifier
//            .fillMaxSize()
//            .padding(10.dp),
//        contentAlignment = Alignment.BottomStart
//        ){
//            Text(
//                text = title,
//                style = androidx.compose.ui.text.TextStyle(color = Color.White, fontSize = 16.sp)
//            )
//        }
//    }
//
//}

//}



