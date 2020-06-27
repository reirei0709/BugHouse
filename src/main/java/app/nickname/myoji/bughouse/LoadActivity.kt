package app.nickname.myoji.bughouse

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class LoadActivity : AppCompatActivity() {

    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_load)

        val  load = intent.getStringExtra("DATA")

        loadtextView.text = load


        //val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)
        //loadtextView.text = sharedPreferences.getString("SAVE", "")
    }
}
