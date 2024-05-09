package com.example.middleexam

data class News(
    val id: Int,
    val name:String,
    val due:String,
    val quantity:Int,
    val description:String
)
data class Novel(
    val id: Int,
    val name:String,
    val type: String,
    val status:String,
    val author:String
)

object UserData{
    val newslist = mutableListOf(
        News(1,"新闻1","Feb 9",1,"这是一个新闻1"),
        News(2,"新闻2","Feb 10",1,"这是一个新闻2"),
        News(3,"新闻3","Oct 20",1,"这是一个新闻3"),
        News(4,"新闻4","Aug 9",1,"这是一个新闻4"),
        News(5,"新闻5","Feb 8",1,"这是一个新闻5"),
        News(6,"新闻6","Sept 97",1,"这是一个新闻6"),
    )
    val NovelList = mutableListOf(
        Novel(1,"告白","言情","可读","作者1"),
        Novel(2,"宠婚","青春文学","可读","作者2"),
        Novel(3,"射雕英雄","武侠","可读","作者3"),
        Novel(4,"花千骨","仙侠","可读","作者4"),
        Novel(5,"难哄","都市","可读","作者5"),
        Novel(6,"无限列车","科幻","可读","作者6"),
    )
}
