package com.example.androidmaster.todoapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.R
import com.example.androidmaster.todoapp.TaskCategory.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TodoActivity : AppCompatActivity() {

    private val categories = listOf(
        Businnes, Personal, Other
    )

    private val tasks = mutableListOf(
        Task("PruebaBusiness", Businnes),
        Task("PruebaPersonal", Personal),
        Task("PruebaOther", Other)
    )

    private lateinit var rvCategorys: RecyclerView
    private lateinit var rvTasks: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var tasksAdapter: TasksAdapter

    private lateinit var fabAddTanks: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initComponent()
        initUI()
        initListeners()
    }

    private fun initListeners() {
        fabAddTanks.setOnClickListener { showDialog() }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_task)

        val btAddTask: Button = dialog.findViewById(R.id.btnAddTask)
        val etTask: EditText = dialog.findViewById(R.id.etTask)
        val rgCategories: RadioGroup = dialog.findViewById(R.id.rgCategories)

        btAddTask.setOnClickListener {
            val currentTask = etTask.text.toString()
            if (currentTask.isNotEmpty()) {
                val selectedId = rgCategories.checkedRadioButtonId
                val selectedRadioButton: RadioButton = rgCategories.findViewById(selectedId)
                val currenCategory: TaskCategory = when (selectedRadioButton.text) {
                    getString(R.string.todo_dialog_category_business) -> Businnes
                    getString(R.string.todo_dialog_category_personal) -> Personal
                    else -> Other
                }

                tasks.add(Task(currentTask, currenCategory))
                updateTasks()
                dialog.hide()
            }
        }

        dialog.show()
    }

    private fun initComponent() {
        rvCategorys = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvCTasks)
        fabAddTanks = findViewById(R.id.fabAddTanks)
    }

    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories) {updateCategories(it)}
        rvCategorys.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategorys.adapter = categoriesAdapter

        tasksAdapter = TasksAdapter(tasks) {onItemSelected(it)}
        rvTasks.layoutManager = LinearLayoutManager(this)
        rvTasks.adapter = tasksAdapter
    }

    private fun onItemSelected(position:Int){
        tasks[position].isSelected = !tasks[position].isSelected
        updateTasks()
    }

    private fun updateCategories(position: Int){
        categories[position].isSelected = !categories[position].isSelected
        categoriesAdapter.notifyItemChanged(position)
        updateTasks()
    }

    private fun updateTasks() {
        val selectedCategories: List<TaskCategory> = categories.filter { it.isSelected }
        val newTasks = tasks.filter { selectedCategories.contains(it.category) }
        tasksAdapter.tasks = newTasks
        tasksAdapter.notifyDataSetChanged()
    }
}