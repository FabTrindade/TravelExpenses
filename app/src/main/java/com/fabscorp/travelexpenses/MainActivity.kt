package com.fabscorp.travelexpenses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fabscorp.travelexpenses.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)
        binding.buttonCalculate.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
            }

        })
    }
    override fun onClick(view: View) {
        TODO("Not yet implemented")
    }

    fun btnCalculate(view: View) {

    }

}