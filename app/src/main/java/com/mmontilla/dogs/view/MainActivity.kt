package com.mmontilla.dogs.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mmontilla.dogs.R
import kotlinx.android.synthetic.main.fragment_list.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
