package com.example.constrainslayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.example.constrainslayout.ui.theme.ConstrainsLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val constraints = ConstraintSet {
                val greenBox = createRefFor("greenbox")
                val redBox = createRefFor("redbox")
                val guidline = createGuidelineFromTop(0.5f)

               constrain(greenBox){
                   top.linkTo(guidline)
                   start.linkTo(parent.start)
                   width = Dimension.value(100.dp)
                   height = Dimension.value(100.dp)
               }
                constrain(redBox){
                    top.linkTo(parent.top)
                    start.linkTo(greenBox.end)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }
            }

            ConstraintLayout(constraints, modifier = Modifier.fillMaxSize()) {

                Box(modifier = Modifier
                    .background(Color.Green)
                    .layoutId("greenbox"))

                Box(modifier = Modifier
                    .background(Color.Red)
                    .layoutId("redbox")
                )
            }
        }
    }
}
