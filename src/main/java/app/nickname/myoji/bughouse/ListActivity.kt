package app.nickname.myoji.bughouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val taskList: List<Task> =mutableListOf(
        Task("Task 1"),
        Task("Task 2"),
        Task("Task 3")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val adapter = TaskAdapter(this, object: TaskAdapter.ItemClickListener{
            override fun onItemClick(task: Task) {
                //taskList.add(Task(name))
                val intent = Intent(this@ListActivity, DetailActivity::class.java)
                intent.putExtra("TASK_NAME",task.name )
                startActivity(intent)
            }
        })

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        adapter.addAll(taskList)

        addButton.setOnClickListener {
            val name = editText.text.toString()
            //taskList.add(Task(name))
            save(name)
            var name1= Task(name)
            adapter.add(name1)
            //adapter.addAll(taskList)

        }
    }
    fun save(name: String){}

}