package com.example.i2pconvertorsmdproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class UserAuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_authentication)

        val loginFragment = LoginFragment()
        val signupFragment = SignUpFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, signupFragment)
            commit()
        }
    }
}