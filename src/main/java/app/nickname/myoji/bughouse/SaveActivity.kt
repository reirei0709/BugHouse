package app.nickname.myoji.bughouse

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_save.*
import app.nickname.myoji.bughouse.DetailActivity
import kotlinx.android.synthetic.main.activity_list.*

class SaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)

        val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)

        saveButton.setOnClickListener {


            val text = input.text.toString()

            //input.text = text

            val editor = sharedPreferences.edit()
            editor.putString("SAVE", text)

            editor.apply()

            //val loadPage = Intent(this, LoadActivity::class.java)

            //loadPage.putExtra("DATA", text)


        }
        }
    }

