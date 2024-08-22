package com.example.customizedalertbox

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.customizedalertbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var dialog: Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myButton = findViewById<Button>(R.id.btn0)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        val btnfeedback = dialog.findViewById<Button>(R.id.btn1)
        val btngood = dialog.findViewById<Button>(R.id.btn2)

        myButton.setOnClickListener {
            dialog.show()
        }

        btnfeedback.setOnClickListener {
            Toast.makeText(this,"Received your feedback...",Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        btngood.setOnClickListener {
            Toast.makeText(this,"Thank You for your response.",Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
    }
}