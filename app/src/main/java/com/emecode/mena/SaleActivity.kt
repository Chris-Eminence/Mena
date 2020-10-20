package com.emecode.mena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import sell.Sell_WebsiteActivity

class SaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sale)


        //declaring the animation here
        val btt = AnimationUtils.loadAnimation(this,R.anim.btt);
        val btt2 = AnimationUtils.loadAnimation(this,R.anim.btt2);
        val btt3 = AnimationUtils.loadAnimation(this,R.anim.btt3);


        val website_sell = findViewById<ImageButton>(R.id.website_sell)
        val webapp_sell = findViewById<ImageButton>(R.id.webapp_sell)
        val mobileapp_sell = findViewById<ImageButton>(R.id.mobileapp_sell)
        val sourcecode_sell = findViewById<ImageButton>(R.id.sourcecode_sell)

        //setting the animation
        website_sell.startAnimation(btt)
        webapp_sell.startAnimation(btt2)
        mobileapp_sell.startAnimation(btt3)
        sourcecode_sell.startAnimation(btt)

        //buttons
        website_sell.setOnClickListener {
            val intent = Intent(applicationContext, Sell_WebsiteActivity::class.java)
            startActivity(intent)
        }
    }
}