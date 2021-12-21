package com.example.madwsr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goNext(view: View) {
        val intent = Intent(this, MainActivity_dark::class.java)
        startActivity(intent)
    }

    fun goAdd(view: View) {
        val intent = Intent(this, AddActivity::class.java)
        startActivity(intent)
    }
}