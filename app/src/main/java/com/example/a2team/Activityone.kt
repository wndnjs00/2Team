package com.example.a2team

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activityone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityone)

        val btn_back = findViewById<Button>(R.id.btn_back)

        btn_back.setOnClickListener {
            finish()
        }

    }
}