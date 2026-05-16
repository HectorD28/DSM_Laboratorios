package com.stack.univesitystore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stack.univesitystore.ui.navigation.AppNavigation
import com.stack.univesitystore.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme(dynamicColor = false) {
                AppNavigation()
            }
        }
    }
}