package com.curso.android.app.tp.tpv3.view
import androidx.lifecycle.ViewModel
import com.curso.android.app.tp.tpv3.model.CompararTexto

class MainViewModel : ViewModel() {
    fun compareStrings(text1: String, text2: String): Boolean {
        val compararTexto = CompararTexto(text1, text2)
        return compararTexto.text1 == compararTexto.text2
    }
}