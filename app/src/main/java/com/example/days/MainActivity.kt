package com.example.days

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    public final lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listView = findViewById(R.id.list_view)
        val values:ArrayList<String> = arrayListOf("saturday","sunday","Monday","Tuesday","Wednesday","Thursday","Friday",)
        val adapter: ArrayAdapter<String> = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, values)
        listView.adapter = adapter

        listView.onItemClickListener= AdapterView.OnItemClickListener {
                adapterview, view, position, id -> Toast.makeText(this, " ${adapterview?.getItemAtPosition(position)} is clicked" ,
            Toast.LENGTH_LONG) .show()}


    }
       var nameMonth : String ="December"
       var year = 2001
       var day = 20
    }
