package app.nickname.myoji.bughouse

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_save.*
import app.nickname.myoji.bughouse.DetailActivity

class SaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)

        val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)

        saveButton.setOnClickListener {

            val text = input.text.toString()

            val editor = sharedPreferences.edit()
            editor.putString("SAVE", text.toString())

             val loadPage = Intent(this, LoadActivity::class.java)

                loadPage.putExtra("DATA",text)

            editor.apply()

            }
        }
    }

