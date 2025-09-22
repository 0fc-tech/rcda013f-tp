package com.example.lancerde

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LancerDeVM : ViewModel() {
    private var _valeurDe = MutableStateFlow(0)
    val valeurDe : StateFlow<Int> = _valeurDe

    fun lancerDe(){
        _valeurDe.value = (1..6).random()
    }
}