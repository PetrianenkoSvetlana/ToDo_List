package com.example.todo_list.ultimate.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.todo_list.R
import com.example.todo_list.ultimate.holder.CardViewHolder
import com.example.todo_list.ultimate.holder.PictureViewHolder
import com.example.todo_list.ultimate.holder.StringViewHolder
import com.example.todo_list.utils.GenericViewHolder

enum class UltimateViewHolderFactory {
    CARD {
        override fun createHolder(parent: ViewGroup): GenericViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemView = inflater.inflate(R.layout.item_card, parent, false)
            return CardViewHolder(itemView)
        }
    },
    PICTURE {
        override fun createHolder(parent: ViewGroup): GenericViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemView = inflater.inflate(R.layout.item_picture, parent, false)
            return PictureViewHolder(itemView)
        }
    },
    STRING {
        override fun createHolder(parent: ViewGroup): GenericViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemView = inflater.inflate(R.layout.item_string, parent, false)
            return StringViewHolder(itemView)
        }
    };

    abstract fun createHolder(parent: ViewGroup): GenericViewHolder
}