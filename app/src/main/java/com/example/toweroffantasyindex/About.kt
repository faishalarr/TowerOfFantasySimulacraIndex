package com.example.toweroffantasyindex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val imgMe: ImageView = findViewById(R.id.imgku)

        val tImg = "https://media-exp1.licdn.com/dms/image/D4D35AQGcCq5QVr8Q5A/profile-framedphoto-shrink_400_400/0/1667135223320?e=1668276000&v=beta&t=PmKD2T9Frw3ZWnPFUUUM51UAsS8M2ni6Z71P8MfZINU"

        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgMe)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}