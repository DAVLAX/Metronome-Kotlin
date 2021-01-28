package com.davlax.metronome

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MetronomeViewModel(application: Application) : ViewModel() {

    private val _currentBeat = MutableLiveData<Number>()
    val currentBeat: LiveData<Number>
        get() = _currentBeat

    init {
        _currentBeat.value = 0
    }
}