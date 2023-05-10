package com.pil.movieApp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment

import com.pil.retrofit_room.databinding.FragmentCustomDialogBinding

//import com.pil.retrofit_room.databinding.FragmentDialogBinding

class ErrorDialogFragment : DialogFragment() {

    private var alertTitle: String? = null
    private var alertMessage: String? = null
    //private lateinit var binding: FragmentDialogBinding
    private lateinit var binding:FragmentCustomDialogBinding
    companion object {
        private const val ARG_TITLE = "title"
        private const val ARG_MESSAGE = "message"

        fun newInstance(title : String? = null, message: String? = null) : ErrorDialogFragment {
            val fragment = ErrorDialogFragment()
            val args = Bundle()
            args.putString(ARG_TITLE, title)
            args.putString(ARG_MESSAGE, message)
            fragment.arguments = args
            return fragment
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentCustomDialogBinding.inflate(layoutInflater)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding.buttonBack.setOnClickListener {
            dismiss()
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        alertTitle = arguments?.getString(ARG_TITLE)
        alertMessage = arguments?.getString(ARG_TITLE)
        binding.headerDialogFragment.text = alertTitle
        binding.dialogFragmentMessage.text = alertMessage
        dialog?.setTitle(ARG_TITLE)
    }

    fun showError(activity: AppCompatActivity){
        val dialog = ErrorDialogFragment()
        dialog.show(activity.supportFragmentManager,"Error Dialog Fragment")
    }
}