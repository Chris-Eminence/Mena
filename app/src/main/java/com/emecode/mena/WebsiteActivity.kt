package com.emecode.mena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity.apply
import androidx.core.view.GravityCompat.apply
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_sell__website.*
import kotlinx.android.synthetic.main.activity_website.*
import recyclerview.List

class WebsiteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)


        val lists = mutableListOf<List>()
        for (i in 0..1000){
            lists.add(List("", "", "", "", ""))
        }
        web_recycler.apply {
            layoutManager = LinearLayoutManager(this@WebsiteActivity)
            adapter = ListsAdapter(lists)
        }
    }
}