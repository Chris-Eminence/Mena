package com.emecode.mena

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_row.*
import kotlinx.android.synthetic.main.list_row.*
import kotlinx.android.synthetic.main.list_row.view.*
import recyclerview.List

class ListsAdapter(private val lists: MutableList<List>) : RecyclerView.Adapter<ListsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardview: TextView = itemView.website_cardview
        val webdescription: TextView = itemView.web_description

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cardview.text = lists[position].website_cardview
        holder.webdescription.text = lists[position].web_description

    }

    override fun getItemCount() = lists.size
}
