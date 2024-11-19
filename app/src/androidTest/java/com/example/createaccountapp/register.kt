package com.example.createaccountapp

    import android.content.Intent
    import android.os.Bundle
    import android.widget.Button
    import android.widget.TextView
    import androidx.appcompat.app.AppCompatActivity

    class RegisterActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.login)


            val logInTextView: TextView = findViewById(R.id.newMemberTextView)
            logInTextView.setOnClickListener {
                val intent = Intent(this, loginactivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                finish()
            }


            val nextButton: Button = findViewById(R.id.nextButton)
            nextButton.setOnClickListener {

            }
        }
    }

