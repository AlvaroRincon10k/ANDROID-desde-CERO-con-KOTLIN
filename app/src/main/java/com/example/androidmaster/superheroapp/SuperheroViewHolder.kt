package com.example.androidmaster.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.databinding.ItemSuperheroBinding

class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)
    fun bind (result: Result){
        binding.tvSuperheroName.text = result.name
    }
}