package com.gamzecoskun.activitylifecycle

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("Test", "onCreate")

        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        Log.e("Test", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Test", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Test", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Test", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Test", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Test", "onDestroy")
    }
}

