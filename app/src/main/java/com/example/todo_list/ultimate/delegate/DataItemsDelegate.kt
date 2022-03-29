package com.example.todo_list.ultimate.delegate

import androidx.recyclerview.widget.RecyclerView
import com.example.todo_list.utils.DataItem

interface DataItemsDelegate {

    var adapter: RecyclerView.Adapter<*>
    val items: List<DataItem>

    fun setItems(items: List<DataItem>)
    fun removeItem(index: Int): DataItem
    fun insertItem(index: Int, item: DataItem)
    fun swap(first: Int, second: Int)
    fun replaceItem(index: Int, item: DataItem): DataItem
}