package com.example.lenovo.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var ButtonPhoto: ImageView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)
        ButtonPhoto = findViewById<ImageView>(R.id.profilePhoto)
        ButtonPhoto?.setOnClickListener({
            val intent = Intent(this, ProfilePhoto::class.java)
            startActivity(intent)
        })
    }
}
