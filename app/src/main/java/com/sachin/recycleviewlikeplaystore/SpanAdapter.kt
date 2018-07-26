package com.sachin.recycleviewlikeplaystore

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SnapHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.zip.Inflater


// Created by sachin singh on 23/7/18.

class SpanAdapter(val context:Context,val snapList:ArrayList<SnapItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_snap_adapter,parent,false)
        return MYViewHolder(view);
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val myHolder:MYViewHolder = holder as MYViewHolder
        myHolder.bind(context,snapList.get(position))
    }

    override fun getItemCount(): Int {
      return snapList.size
    }

    class MYViewHolder(view :View) : RecyclerView.ViewHolder(view) {
        val textViewTitle :TextView = view.findViewById(R.id.textViewSnapTitle)
        val recyclerView :RecyclerView = view.findViewById(R.id.recyclerViewSnap)

        fun bind(context:Context,snapItem:SnapItem){
            textViewTitle.text = snapItem.title
            recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            recyclerView.adapter = ItemAdapter(snapItem.itemList);
            recyclerView.onFlingListener =  null
            val snapHelper:SnapHelper = LinearSnapHelper()
            snapHelper.attachToRecyclerView(recyclerView)
        }
    }

}