package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.snackbar.domain.Usuario
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var usuario: Usuario? = intent.getSerializableExtra("1") as? Usuario

        Toast.makeText(this, usuario?.username, Toast.LENGTH_SHORT).show()
    }
}
