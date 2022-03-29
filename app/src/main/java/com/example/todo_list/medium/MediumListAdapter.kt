package com.example.todo_list.medium

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.todo_list.R
import com.example.todo_list.utils.DataItem

class MediumListAdapter : ListAdapter<DataItem, MediumViewHolder>(MediumItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediumViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_string, parent, false)
        itemView.setOnClickListener { }
        return MediumViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MediumViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}