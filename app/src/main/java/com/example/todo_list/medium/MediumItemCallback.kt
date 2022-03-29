package com.example.todo_list.medium

import androidx.recyclerview.widget.DiffUtil
import com.example.todo_list.utils.DataItem

class MediumItemCallback : DiffUtil.ItemCallback<DataItem>() {

    override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem.areItemsTheSame(newItem)
    }

    override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        // нам не важно какого класса айтем,
        // каждый из них сам решает какая должна быть логика сравнения контента
        return newItem.areContentsTheSame(oldItem)
    }
}