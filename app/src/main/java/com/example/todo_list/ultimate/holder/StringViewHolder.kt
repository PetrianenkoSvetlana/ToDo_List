package com.example.todo_list.ultimate.holder

import android.view.View
import com.example.todo_list.databinding.ItemStringBinding
import com.example.todo_list.ultimate.data.StringItem
import com.example.todo_list.utils.DataItem
import com.example.todo_list.utils.GenericViewHolder

class StringViewHolder(itemView: View) : GenericViewHolder(itemView) {

    private val viewBinding = ItemStringBinding.bind(itemView)

    init {
        itemView.setOnClickListener {
        }
    }

    override fun bind(data: DataItem) {
        data as StringItem
        viewBinding.itemString.text = data.string
    }
}