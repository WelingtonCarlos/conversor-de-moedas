package com.example.conversoreurobrl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversoreurobrl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConversor.setOnClickListener {
            val brl = binding.valueBrl.text.toString().toDouble()
            val eur = String.format("%.2f", brl * 5.23)
            val dol = String.format("%.2f", brl * 4.8)

            binding.valueEur.text = "€ " + eur
            binding.valueDol.text = "$ " + dol
        }
    }
}