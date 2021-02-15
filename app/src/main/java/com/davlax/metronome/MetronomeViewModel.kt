package com.davlax.metronome

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MetronomeViewModel(application: Application) : ViewModel() {

    private val _currentBeat = MutableLiveData<Number>()
    val currentBeat: LiveData<Number>
        get() = _currentBeat

    init {
        _currentBeat.value = 0
    }

    fun runMetronome() {
        viewModelScope.launch {

//            Toast.makeText(this, "Its toast!", Toast.LENGTH_SHORT).show()
        }
    }
}