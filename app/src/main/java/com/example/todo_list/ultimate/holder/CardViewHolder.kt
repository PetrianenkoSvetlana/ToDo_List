package com.example.todo_list.ultimate.holder

import android.icu.text.SimpleDateFormat
import android.view.View
import com.example.todo_list.databinding.ItemCardBinding
import com.example.todo_list.ultimate.data.CardItem
import com.example.todo_list.utils.DataItem
import com.example.todo_list.utils.GenericViewHolder
import java.util.*

class CardViewHolder(itemView: View) : GenericViewHolder(itemView) {

    private val viewBinding = ItemCardBinding.bind(itemView)

    init {
        itemView.setOnClickListener {
        }
    }

    override fun bind(data: DataItem) {
        data as CardItem
        viewBinding.itemPicture.setBackgroundColor(data.picture)
        viewBinding.itemString.text = data.string
        val date = SimpleDateFormat.getDateInstance().format(Date(data.timestamp))
        viewBinding.itemDate.text = date
    }
}