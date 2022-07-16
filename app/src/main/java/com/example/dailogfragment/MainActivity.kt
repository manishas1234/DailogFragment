package com.example.dailogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rateMeTextView1=findViewById<TextView>(R.id.rateMeTextView)
        rateMeTextView1.setOnClickListener()
        {
            var dailog=CustomDailogFragment()
            dailog.show(supportFragmentManager,"customDailog")

        }
    }
}