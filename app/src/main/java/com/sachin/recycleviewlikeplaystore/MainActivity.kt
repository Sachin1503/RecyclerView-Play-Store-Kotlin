package com.sachin.recycleviewlikeplaystore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView :RecyclerView  = findViewById(R.id.recyclerView);
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SpanAdapter(this,getDummySnapData())
    }

    private fun getDummySnapData():ArrayList<SnapItem>{
        val apps = getItems();
        var snapList:ArrayList<SnapItem> = ArrayList()
        snapList.add(SnapItem("Category 1", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 2", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 3", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 4", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 5", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 6", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 7", apps as ArrayList<Item>))
        return snapList
    }

    private fun getItems(): List<Item> {
        val apps = ArrayList<Item>()
        apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
        apps.add(Item("Gmail", R.drawable.ic_gmail_48dp, "4.8"))
        apps.add(Item("Inbox", R.drawable.ic_inbox_48dp, "4.5"))
        apps.add(Item("Google Keep", R.drawable.ic_keep_48dp, "4.2"))
        apps.add(Item("Google Drive", R.drawable.ic_drive_48dp, "4.6"))
        apps.add(Item("Hangouts", R.drawable.ic_hangouts_48dp, "39"))
        apps.add(Item("Google Photos", R.drawable.ic_photos_48dp, "4.6"))
        apps.add(Item("Messenger", R.drawable.ic_messenger_48dp, "4.2"))
        apps.add(Item("Sheets", R.drawable.ic_sheets_48dp, "4.2"))
        apps.add(Item("Slides", R.drawable.ic_slides_48dp, "4.2"))
        apps.add(Item("Docs", R.drawable.ic_docs_48dp, "4.2"))
        return apps
    }
}
