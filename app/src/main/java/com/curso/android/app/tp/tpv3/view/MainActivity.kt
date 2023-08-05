package com.curso.android.app.tp.tpv3.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.curso.android.app.tp.tpv3.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.compareButton.setOnClickListener {
            val text1 = binding.editText1.text.toString()
            val text2 = binding.editText2.text.toString()
            val result = mainViewModel.compareStrings(text1, text2)

            binding.resultTextView.text = if (result) "Las cadenas son iguales" else "Las cadenas son distintas"
        }
    }
}



