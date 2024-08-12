package com.example.guests.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.guests.repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {
    private val respository = GuestRepository.getInstance(application)

    //Example
    fun getUsers() {
    }

}