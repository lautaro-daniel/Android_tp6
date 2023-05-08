package com.pil.movieApp.util

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.pil.retrofit_room.R

object ErrorDialog {

    fun showErrorDialog(activity: AppCompatActivity){
        val errorBuilder = AlertDialog.Builder(activity)
        errorBuilder.setTitle(R.string.error_dialog_title)
        errorBuilder.setTitle(R.string.message_error_dialog)

        errorBuilder.setNeutralButton(R.string.error_dialog_button){ _, _ ->}
        errorBuilder.show()
    }
}