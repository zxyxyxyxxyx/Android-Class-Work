package com.example.middleexam


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController


@Composable
fun NewsPage(navController: NavHostController, NewsList: List<News>) {
    Column {
        for (i in 1..3) {
            Text(text = NewsList[i].name)
            Text(text = "新闻信息")
            Text(text = "新闻正文")

            Button(onClick = {
                navController.navigate("index")
            }) {
                Text(text = "返回首页")
            }
        }
    }
}
