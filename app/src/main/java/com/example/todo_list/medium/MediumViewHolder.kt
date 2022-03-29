package com.example.todo_list.medium

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_list.R
import com.example.todo_list.ultimate.data.StringItem
import com.example.todo_list.utils.DataItem

class MediumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val title: TextView = itemView.findViewById(R.id.item_string)

    fun bind(item: DataItem) {
        item as StringItem
        title.text = item.string
    }
}