package com.example.landmark

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentView : Fragment() {
    private lateinit var myAdapter : LandmarkAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }
        fun initRecyclerView(){
        val data = LandmarkModel.setData()
        val recyclerView  : RecyclerView? = view?.findViewById(R.id.item_view)
        recyclerView?.layoutManager = LinearLayoutManager(activity)
        myAdapter = LandmarkAdapter(LandmarkAdapter.OnClickListener{ item ->
            Toast.makeText(activity,"${item.author}", Toast.LENGTH_SHORT).show()
        })
        recyclerView?.adapter = myAdapter
        myAdapter.setData(data)
    }
}