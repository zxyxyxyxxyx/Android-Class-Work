package com.example.middleexam


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController


@Composable
fun NovelPage(navController: NavHostController,NovelList: List<Novel>) {
    Column {
        for (i in 1..3) {
            Text(text = NovelList[i].name)
            Text(text = "小说信息")
            Text(text = "小说")

            Button(onClick = {
                navController.navigate("index")
            }) {
                Text(text = "返回首页")
            }
        }
    }
}