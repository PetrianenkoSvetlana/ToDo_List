package com.example.todo_list.ultimate.api

import com.example.todo_list.utils.DataItem

interface UltimateItemListener {
    fun onItemClick(index: Int, item: DataItem)
}