package com.example.exp1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var clgname: TextView =findViewById(R.id.clgname)
        var fontbtn: Button =findViewById(R.id.fontbtn)
        var colorbtn: Button =findViewById(R.id.colorbtn)
        var bgbtn: Button =findViewById(R.id.bgbtn)
        var layout: LinearLayout =findViewById(R.id.layout)
        var size:Float=10f
        var color:Int=0
        var bg:Int=0

        fontbtn.setOnClickListener(){
            clgname.setTextSize(size)
            size=(size+5)%50
        }

        colorbtn.setOnClickListener(){
            when(color%3){
                0 -> clgname.setTextColor(Color.BLACK)
                1 -> clgname.setTextColor(Color.MAGENTA)
                2 -> clgname.setTextColor(Color.BLUE)
            }
            color+=1
        }

        bgbtn.setOnClickListener(){
            when(bg%3){
                0 -> layout.setBackgroundColor(Color.LTGRAY)
                1 -> layout.setBackgroundColor(Color.CYAN)
                2 -> layout.setBackgroundColor(Color.YELLOW)
            }
            bg+=1
        }
    }
}