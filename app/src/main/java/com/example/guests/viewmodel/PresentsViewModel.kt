package com.example.guests.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PresentsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is present Fragment"
    }
    val text: LiveData<String> = _text
}