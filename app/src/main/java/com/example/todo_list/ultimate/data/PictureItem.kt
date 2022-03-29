package com.example.todo_list.ultimate.data

import com.example.todo_list.utils.DataItem

class PictureItem(
    val index: Int,
    val picture: Int,
) : DataItem {

    override val id: Long = picture.toLong()

    override fun areContentsTheSame(other: DataItem): Boolean {
        // принцип такой же, как в equals()
        return when {
            other !is PictureItem -> false
            other.index != index -> false
            other.picture != picture -> false
            else -> true
        }
    }
}