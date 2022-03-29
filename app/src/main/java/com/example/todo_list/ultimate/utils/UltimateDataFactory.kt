package com.example.todo_list.ultimate.utils

import android.graphics.Color
import android.icu.util.Calendar
import com.example.todo_list.ultimate.data.CardItem
import com.example.todo_list.ultimate.data.PictureItem
import com.example.todo_list.ultimate.data.StringItem
import com.example.todo_list.utils.DataItem
import com.example.todo_list.utils.RandomFactory

class UltimateDataFactory {
    companion object {

        fun createString(index: Int): StringItem = StringItem("Item $index")

        fun createPicture(index: Int): PictureItem = PictureItem(index, randomColor())

        fun createCard(index: Int): CardItem {
            val now = Calendar.getInstance()
            now.set(Calendar.DAY_OF_YEAR, (Math.random() * 365).toInt())
            return CardItem("Item $index", randomColor(), now.timeInMillis)
        }

        fun randomColor(): Int = Color.rgb(randomColorByte(), randomColorByte(), randomColorByte())

        private fun randomColorByte() = (Byte.MAX_VALUE / 3 * 2 + Math.random() * Byte.MAX_VALUE / 3).toInt()
    }

    private val itemsFactory = RandomFactory(UltimateViewHolderFactory.values())

    fun getItems(): MutableList<DataItem> = (0..20).map { next(it) }.toMutableList()

    private fun next(index: Int): DataItem {
        /*when {
            index == 2 -> return createCard(2)
            index == 3 -> return PictureItem(index, randomColor())
            index == 4 -> return createCard(4)
        }*/
        return when (itemsFactory.next()) {
            UltimateViewHolderFactory.CARD -> createCard(index)
            UltimateViewHolderFactory.PICTURE -> createPicture(index)
            UltimateViewHolderFactory.STRING -> createString(index)
        }
    }
}