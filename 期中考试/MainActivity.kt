package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "index") {

        composable("index") { IndexPage(navController) }
        composable("NewsPage") { NewsPage(navController, UserData.newslist) }
        composable("NovelPage") { NovelPage(navController,UserData.NovelList) }
        composable("EndPage") { EndPage(navController) }
    }
}
@Composable
fun IndexPage(navController: NavController){
    Column {
        Button(onClick = { navController.navigate("NewsPage")}) {
            Text(text = "新闻")
        }
        Button(onClick = { navController.navigate("NovelPage")}) {
            Text(text = "小说")
        }
        Button(onClick = { navController.navigate("EndPage")}) {
            Text(text = "结束")
        }
    }

}

@Composable
@Preview(showSystemUi = true)
fun PreviewHost(){
    Navigator()
}
