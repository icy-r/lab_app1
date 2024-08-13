package com.example.try1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginAvtivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var loginbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        loginbtn = findViewById(R.id.loginbtn)

        loginbtn.setOnClickListener {
            val email = email.text.toString()
            val password = password.text.toString()

//            intent = Intent(this, HomeActivity::class.java)
//            startActivity(intent)
//            finish()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            } else {
                if (email == "icy" && password == "icy") {
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

                    intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
                }
                }
            }

    }
}