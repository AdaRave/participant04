package com.example.madwsr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity_dark : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dark)
    }

    fun goSettings(view: View) {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)


    }
    fun goShare(view: View) {}
}