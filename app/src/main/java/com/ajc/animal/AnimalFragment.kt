package com.ajc.animal

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class AnimalFragment : Fragment() {
    private lateinit var animalAdapter : AnimalAdapter
    private var recyclerView: RecyclerView? = null
    private val animalList = ArrayList<Animal>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printLongs("onCreate")
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        buildList()
        setRecyclerView()
    }
    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerview)
    }

    private fun buildList() {
        for (i in 0..99) {
            val animal = Animal("ZOHO", R.drawable.dog2)
            animalList.add(animal)
            Log.d("debug",animalList.size.toString())
        }
    }

    private fun setRecyclerView() {
        animalAdapter = AnimalAdapter(animalList)
        val linearLayoutManager = GridLayoutManager(context, 2)
        recyclerView!!.layoutManager = linearLayoutManager
        recyclerView!!.adapter = animalAdapter
    }

    private fun printLongs(name: String) {
        Log.d("debug:", name)
    }
}


//on attach, onCreate, onCreateViews, onViewCreated