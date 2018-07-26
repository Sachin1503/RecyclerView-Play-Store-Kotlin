package com.sachin.recycleviewlikeplaystore

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


// Created by sachin singh on 25/7/18.

class ItemAdapter(val list:ArrayList<Item>) :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.list_item_adapter,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemViewHolder:ItemViewHolder = holder as ItemViewHolder
        itemViewHolder.bind(list.get(position))
    }



    override fun getItemCount(): Int {
        return list.size
    }

    class ItemViewHolder(view:View):RecyclerView.ViewHolder(view){
        val textViewName:TextView = view.findViewById(R.id.textViewAppName)
        val textViewSize:TextView = view.findViewById(R.id.textViewSize)
        val imageViewAppPhoto:ImageView = view.findViewById(R.id.imageView)

        public fun bind(item:Item){
            textViewName.text = item.name
            textViewSize.text = item.size
            imageViewAppPhoto.setImageResource(item.drawable)
        }
    }

}