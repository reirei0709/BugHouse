package app.nickname.myoji.bughouse

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class LoadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_load)

        val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)

        //val  load = intent.getStringExtra("DATA")

        //val   save = sharedPreferences.getString("SAVE","")
        //loadtextView.text =save


        loadtextView.text = sharedPreferences.getString("SAVE", "")
    }




}
