package com.happyplaces.activities

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.happyplaces.R

class DetailsActivity : AppCompatActivity() {
    lateinit var shared : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        shared = getSharedPreferences("sharedPre" , Context.MODE_PRIVATE)


        val textView = findViewById<TextView>(R.id.text_view)
        val prData = shared.getString("preData" , "" );

        textView.text = "The last location clicked was $prData";
    }
}