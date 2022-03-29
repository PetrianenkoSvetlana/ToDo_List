package com.example.todo_list.ultimate.api

import com.example.todo_list.ultimate.UltimateAdapter
import com.example.todo_list.ultimate.data.CardItem
import com.example.todo_list.ultimate.data.PictureItem
import com.example.todo_list.ultimate.data.StringItem
import com.example.todo_list.ultimate.utils.UltimateDataFactory
import com.example.todo_list.utils.DataItem
import java.lang.IllegalArgumentException

// по-хорошему в роли реализации интерфейса должен быть делегат активити/фрагмента
class UltimateItemListenerImpl(
    private val adapter: UltimateAdapter,
) : UltimateItemListener {

    override fun onItemClick(index: Int, item: DataItem) {
        val replacement = when (item) {
            is StringItem -> UltimateDataFactory.createPicture(index)
            is PictureItem -> UltimateDataFactory.createCard(index)
            is CardItem -> UltimateDataFactory.createString(index)
            else -> throw IllegalArgumentException()
        }
        adapter.replaceItem(index, replacement)
    }
}