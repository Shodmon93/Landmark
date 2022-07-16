package com.example.landmark

import android.app.Activity
import android.app.Notification
import android.app.NotificationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         //setContentView(R.layout.activity_main)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ViewDataBinding>(this,R.layout.activity_main)

        }


//    fun initRecyclerView(){
//        val data = LandmarkModel.setData()
//        val recyclerView  : RecyclerView = findViewById(R.id.item_view)
//        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
//        myAdapter = LandmarkAdapter(LandmarkAdapter.OnClickListener{ item ->
//            Toast.makeText(this,"${item.author}", Toast.LENGTH_SHORT).show()
//        })
//        recyclerView.adapter = myAdapter
//        myAdapter.setData(data)
//    }

}