package app.nickname.myoji.bughouse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class CountActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        var number: Int = 0
        loadtextView.text= "0"

        button.setOnClickListener {
            number += 1
            loadtextView.text = number.toString()

        }
    }
}


