package com.example.try1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    lateinit var homebtn: ImageView
    lateinit var tipsbtn: ImageView
    lateinit var goalsbtn: ImageView
    lateinit var profilebtn: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        homebtn = findViewById(R.id.home)
        tipsbtn = findViewById(R.id.tips)
        goalsbtn = findViewById(R.id.goal)
        profilebtn = findViewById(R.id.profile)

        homebtn.setOnClickListener {
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        tipsbtn.setOnClickListener {
            intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
            finish()
        }

        goalsbtn.setOnClickListener {
            intent = Intent(this, GoalsActivity::class.java)
            startActivity(intent)
            finish()
        }

        profilebtn.setOnClickListener {
            intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}