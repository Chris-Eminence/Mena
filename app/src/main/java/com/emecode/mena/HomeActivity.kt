package com.emecode.mena

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //declaring the animation here
        val ttb = AnimationUtils.loadAnimation(this,R.anim.ttb);

        val sell_btn = findViewById<ImageButton>(R.id.sell_btn)
        val website_btn = findViewById<ImageButton>(R.id.website_btn)
        val webapp_btn = findViewById<ImageButton>(R.id.webapp_btn)
        val mobileapp_btn = findViewById<ImageButton>(R.id.mobileapp_btn)
        val sourcecode_btn = findViewById<ImageButton>(R.id.sourcecode_btn)
        val about_btn = findViewById(R.id.about_btn) as ImageButton

        //setting the animation
        sell_btn.startAnimation(ttb)
        website_btn.startAnimation(ttb)
        webapp_btn.startAnimation(ttb)
        mobileapp_btn.startAnimation(ttb)
        sourcecode_btn.startAnimation(ttb)
        about_btn.startAnimation(ttb)

        //buttons
        sell_btn.setOnClickListener {
            val intent = Intent(applicationContext, SaleActivity::class.java)
            startActivity(intent)
        }

        website_btn.setOnClickListener{
            val intent = Intent(applicationContext, WebsiteActivity::class.java)
            startActivity(intent)
        }
    }
}