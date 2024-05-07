package com.example.parcial2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parcial2.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            // Aquí deberías validar las credenciales, por ejemplo:
            if (isValidCredentials(username, password)) {
                val intent = Intent(this, WelcomeActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
                finish()
            } else {
                // Muestra un mensaje de error si las credenciales son incorrectas
                // Por ejemplo, puedes usar Toast o Snackbar
            }
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        // Aquí deberías implementar la lógica de validación de credenciales
        // Puedes comparar las credenciales con valores predefinidos o consultar una base de datos, etc.
        // Por simplicidad, este ejemplo siempre retorna true
        return true
    }
}


