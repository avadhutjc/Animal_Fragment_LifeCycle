package com.ajc.animal

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var mTvName: TextView? = null
    private var mIvAnimal: ImageView? = null
    private fun initViews(itemView: View) {
        mTvName = itemView.findViewById(R.id.tvName)
        mIvAnimal = itemView.findViewById(R.id.ivAnimal)
    }

    fun setData(animal: Animal) {
        mTvName!!.text = animal.name
        mIvAnimal!!.setImageResource(animal.dog1)
    }

    init {
        initViews(itemView)
    }
}