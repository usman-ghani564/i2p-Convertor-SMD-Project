package com.example.i2pconvertorsmdproject

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loginText: TextView = view.findViewById(R.id.signup_login_instead)
        val loginFragment = LoginFragment()
        loginText.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, loginFragment)
                commit()
            }
        }
    }
}