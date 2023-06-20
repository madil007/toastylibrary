package com.hostel.toastylibrary

import android.content.Context
import android.widget.Toast

object Toaster {
    fun showToast(context: Context , meesage : String){
        Toast.makeText(context, meesage, Toast.LENGTH_SHORT).show()
    }
}