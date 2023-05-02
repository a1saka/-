package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button_save:Button = findViewById(R.id.buttonSave)
        val check:CheckBox = findViewById(R.id.checkBox)
        val progressBar:ProgressBar = findViewById(R.id.progressBar)
        val savedText:TextView = findViewById(R.id.textView)
        val NeedToSave:EditText = findViewById(R.id.editText)
        button_save.setOnClickListener {
            if(check.isChecked){
                if(progressBar.progress == 100){
                    Toast.makeText(applicationContext,"Кончилась память!", Toast.LENGTH_SHORT).show()
                }else{
                    progressBar.progress = progressBar.progress + 10
                    Toast.makeText(applicationContext,"Сохранено!", Toast.LENGTH_SHORT).show()
                }
                savedText.setText(NeedToSave.text)
            }
        }
    }
}