package com.example.ussd.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class XizmatlarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Xizmatlar Fragment"
    }
    val text: LiveData<String> = _text
}