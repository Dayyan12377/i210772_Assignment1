package com.example.assignment1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class Signup_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)

        val spinner1: Spinner = findViewById(R.id.spinner1)
        val adapter1: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this,
            R.array.countries,
            android.R.layout.simple_spinner_item
        )

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner1.adapter=adapter1

        val spinner2: Spinner = findViewById(R.id.spinner2)
        val adapter2: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this,
            R.array.cities,
            android.R.layout.simple_spinner_item
        )

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner2.adapter=adapter2





    }
}