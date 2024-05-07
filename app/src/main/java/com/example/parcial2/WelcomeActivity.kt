package com.example.parcial2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.parcial2.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("username")
        val welcomeMessage = "Bienvenido, $username!"
        binding.welcomeTextView.text = welcomeMessage

        // Si quieres que MainActivity se inicie después de un cierto tiempo:
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, DELAY_TIME_IN_MILLISECONDS)

        // Si quieres que MainActivity se inicie cuando el usuario toque algún botón o área de la pantalla:
        binding.welcomeTextView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    companion object {
        private const val DELAY_TIME_IN_MILLISECONDS = 3000L // 3 segundos
    }
}
