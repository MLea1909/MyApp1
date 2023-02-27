package com.example.myapp1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gumbic1: Button = findViewById(R.id.gumbic_1)
        var prikaz = 1
        gumbic1.setOnClickListener {
            //Toast.makeText( this,"button clicked", Toast.LENGTH_SHORT).show()
            if (prikaz == 1) {
                val tekst1: TextView = findViewById(R.id.tekst_1)
                tekst1.text = ""
                val gumbic1: Button = findViewById(R.id.gumbic_1)
                gumbic1.text = "prikaži tekst"
                prikaz = 0
            }
            else {
                val tekst1: TextView = findViewById(R.id.tekst_1)
                tekst1.text = "Gumbić je ispod"
                val gumbic1: Button = findViewById(R.id.gumbic_1)
                gumbic1.text = "sakrij tekst"
                prikaz = 1
            }

        }
    }

}