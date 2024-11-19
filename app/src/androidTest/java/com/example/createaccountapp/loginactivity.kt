package com.example.createaccountapp

import CredentialsManager
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.button.MaterialButton
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private val credentialsManager = CredentialsManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_acc)


        val emailInputLayout: TextInputLayout = findViewById(R.id.emailEditText)
        val passwordInputLayout: TextInputLayout = findViewById(R.id.passwordEditText)
        val nextButton: MaterialButton = findViewById(R.id.nextButton)
        val newMemberTextView: TextView = findViewById(R.id.newMemberTextView)


        newMemberTextView.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        nextButton.setOnClickListener {
            val email = emailInputLayout.editText?.text.toString()
            val password = passwordInputLayout.editText?.text.toString()


            if (!credentialsManager.isValidEmail(email)) {
                emailInputLayout.error = "Invalid email format"
                return@setOnClickListener
            } else {
                emailInputLayout.error = null
            }


            if (!credentialsManager.isValidPassword(password)) {
                passwordInputLayout.error = "Password must be at least 4 characters"
                return@setOnClickListener
            } else {
                passwordInputLayout.error = null
            }

            if (credentialsManager.login(email, password)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid credentials. Please try again.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
