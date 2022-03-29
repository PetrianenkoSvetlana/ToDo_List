package com.example.todo_list.ultimate.holder

import android.content.res.ColorStateList
import android.view.View
import com.example.todo_list.databinding.ItemPictureBinding
import com.example.todo_list.ultimate.data.PictureItem
import com.example.todo_list.utils.DataItem
import com.example.todo_list.utils.GenericViewHolder

class PictureViewHolder(itemView: View) : GenericViewHolder(itemView) {

    private val viewBinding = ItemPictureBinding.bind(itemView)

    init {
        itemView.setOnClickListener {
        }
    }

    override fun bind(data: DataItem) {
        data as PictureItem
        viewBinding.itemPicture.backgroundTintList = ColorStateList.valueOf(data.picture)
        viewBinding.itemString.text = data.index.toString()
    }
}