package com.bignerdranch.android.geoquiz

import androidx.lifecycle.ViewModel

private const val TAG = "CheatViewModel"

class CheatViewModel : ViewModel() {
    private var isCheater: Boolean = false


    fun setIsCheater(cheater: Boolean) {
        isCheater = cheater
    }



}