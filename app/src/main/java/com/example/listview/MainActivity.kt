package com.example.listview

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView : ListView

        listView=findViewById(R.id.listView)

        var list = ArrayList<String>()

        list.clear()
        list.add("item1")
        list.add("item2")
        list.add("item3")
        list.add("item4")
        list.add("item5")
        list.add("item6")
        list.add("item7")
        list.add("item8")
        list.add("item9")
        list.add("item10")
        list.add("item11")
        list.add("item12")
        list.add("item13")
        list.add("item14")
        list.add("item15")
        list.add("item16")
        list.add("item17")
        list.add("item18")
        list.add("item19")
        list.add("item20")
        list.add("item21")
        list.add("item22")
        list.add("item23")
        list.add("item24")
        list.add("item25")

        var arrayAdapter = ArrayAdapter<String>(this,R.layout.layout_list_view,list)
        listView.adapter = arrayAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->

            val selectedItem = adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

                Toast.makeText(applicationContext,"clicked item is $selectedItem its position is $itemIdAtPos",Toast.LENGTH_SHORT).show()

        }

    }


}