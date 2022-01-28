package com.ajc.animal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

    class AnimalAdapter(private val animalList: ArrayList<Animal>) :
        RecyclerView.Adapter<AnimalViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
            return AnimalViewHolder(view)
        }

        override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
            val animal = animalList[position]
            holder.setData(animal)
        }

        override fun getItemCount(): Int {
            return animalList.size
        }
}