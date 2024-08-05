package com.example.guests.viewmodel

import androidx.lifecycle.ViewModel
import com.example.guests.repository.GuestRepository

class GuestFormViewModel: ViewModel() {
    private val respository = GuestRepository

    //Example
    fun getUsers() {
        GuestRepository.getInstance()
    }

}