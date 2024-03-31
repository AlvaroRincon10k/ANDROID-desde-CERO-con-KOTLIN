package com.example.androidmaster.todoapp

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.R

class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName)
    private val divide: View = view.findViewById(R.id.divider)
    private val viewContainer: CardView = view.findViewById(R.id.viewContainer)

    fun render(taskCategory: TaskCategory, onItemSelected: (Int) -> Unit) {

        val color = if (taskCategory.isSelected) {
            R.color.todo_background_card
        } else {
            R.color.todo_background_disabled
        }

        viewContainer.setCardBackgroundColor(ContextCompat.getColor(viewContainer.context, color))

        itemView.setOnClickListener { onItemSelected(layoutPosition) }

        when (taskCategory) {
            TaskCategory.Businnes -> {
                tvCategoryName.text = "Negocios"
                divide.setBackgroundColor(
                    ContextCompat.getColor(
                        divide.context,
                        R.color.todo_business_category
                    )
                )
            }

            TaskCategory.Other -> {
                tvCategoryName.text = "Otros"
                divide.setBackgroundColor(
                    ContextCompat.getColor(
                        divide.context,
                        R.color.todo_other_category
                    )
                )
            }

            TaskCategory.Personal -> {
                tvCategoryName.text = "Personal"
                divide.setBackgroundColor(
                    ContextCompat.getColor(
                        divide.context,
                        R.color.todo_personal_category
                    )
                )
            }
        }
    }
}