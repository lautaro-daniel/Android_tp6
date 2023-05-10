package com.pil.movieApp.util


import android.content.Intent
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.pil.movieApp.activity.MainActivity
import com.pil.retrofit_room.R

object ErrorDialogAlert : DialogFragment() {

    fun showErrorDialog(activity : AppCompatActivity){
        val alert = AlertDialog.Builder(activity)
        alert.apply {
            setIcon(R.drawable.error)
            setTitle(R.string.error_dialog_title)
            setMessage(R.string.message_error_dialog)
            setCancelable(false)
            setNeutralButton(
                R.string.error_dialog_button
            ) { _, _ ->
                val intent = Intent(activity, MainActivity::class.java)
                activity.startActivity(intent)
            }
        }
        alert.show()
    }
}
