package com.example.rally

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.rally.ui.components.RallyTabRow
import com.example.rally.ui.theme.RallyTheme

class RallyDate : ComponentActivity(){
    override  fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent {
            RallyApp()
        }
    }
}
@Composable
fun RallyApp() {
    RallyTheme {
        val navController = rememberNavController()
        val currentBackStack by navController.currentBackStackEntryAsState()
        val currentDestination = currentBackStack?.destination
        val currentScreen =
            rallyTabRowScreens.find{ it.route == currentDestination?.route } ?: Overview

        Scaffold (
            topBar = {
                RallyTabRow(
                    allScreens = rallyTabRowScreens,
                    onTabSelected ={ newScreen ->
                        navController.navigateSingleTopTo(newScreen.route)
                    } ,
                    currentScreen = currentScreen
                )
            }
        ){innerPadding ->
            RallyNavHost(
                navController = navController,
                modifier = Modifier.padding(innerPadding)
            )

        }
    }
}
@Preview(showBackground = true)
@Composable
fun AppPreview(){
    RallyTheme {
        RallyApp()
    }
}