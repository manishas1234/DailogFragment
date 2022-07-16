package com.example.dailogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class CustomDailogFragment: DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.fragment_custon_dailog,container,false)
        val radioGroup=rootView.findViewById<RadioGroup>(R.id.ratingRadioGroup)
        var cancelButton = rootView.findViewById<Button>(R.id.cancelButton)
        cancelButton.setOnClickListener(){
            dismiss()
        }
        var submitButton=rootView.findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener()
        {
            var selectedId=radioGroup.checkedRadioButtonId
            var radio=rootView?.findViewById<RadioButton>(selectedId)
            if(radio==null)
            {
                Toast.makeText(context, "Please Rate", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var result=radio.text.toString()
                Toast.makeText(context, "You rated $result", Toast.LENGTH_SHORT).show()
                dismiss()
            }

        }
        return rootView
    }

}