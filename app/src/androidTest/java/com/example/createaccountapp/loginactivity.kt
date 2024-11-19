package com.example.createaccountapp

import android.content.Intent
    import android.os.Bundle
    import android.widget.TextView
    import androidx.appcompat.app.AppCompatActivity

    class loginactivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.create_acc) // Link the XML file

            val newMemberTextView: TextView = findViewById(R.id.newMemberTextView)
            newMemberTextView.setOnClickListener {
                val intent = Intent(this, loginactivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                finish()
            }
        }
    }
