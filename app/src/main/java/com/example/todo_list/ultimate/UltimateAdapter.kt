package com.example.todo_list.ultimate

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_list.ultimate.api.UltimateItemListener
import com.example.todo_list.ultimate.data.CardItem
import com.example.todo_list.ultimate.data.PictureItem
import com.example.todo_list.ultimate.data.StringItem
import com.example.todo_list.ultimate.delegate.DataItemsDelegate
import com.example.todo_list.ultimate.delegate.DataItemsDelegateImpl
import com.example.todo_list.ultimate.utils.UltimateViewHolderFactory
import com.example.todo_list.utils.GenericViewHolder
import java.lang.Exception

class UltimateAdapter : RecyclerView.Adapter<GenericViewHolder>(), DataItemsDelegate by DataItemsDelegateImpl() {

    private var itemListener: UltimateItemListener? = null

    init {
        adapter = this // небольшой костыль для DataItemsDelegateImpl
        setHasStableIds(true)
    }

    fun setListener(listener: UltimateItemListener?) {
        itemListener = listener
    }

    override fun getItemCount(): Int = items.size

    override fun getItemId(position: Int): Long = items[position].id

    override fun getItemViewType(position: Int): Int = when (items[position]) {
        is CardItem -> UltimateViewHolderFactory.CARD.ordinal
        is PictureItem -> UltimateViewHolderFactory.PICTURE.ordinal
        is StringItem -> UltimateViewHolderFactory.STRING.ordinal
        else -> throw Exception()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder {
        val holder = UltimateViewHolderFactory.values()[viewType].createHolder(parent)
        holder.itemView.setOnClickListener {
            val position = holder.bindingAdapterPosition
            if (position != -1) {
                itemListener?.onItemClick(position, items[position])
            }
        }
        return holder
    }

    override fun onBindViewHolder(holder: GenericViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun onBindViewHolder(
        holder: GenericViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        super.onBindViewHolder(holder, position, payloads)
    }
}