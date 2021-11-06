package com.intent2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MoveWithDataAktivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tvDataReceived: TextView
    private lateinit var btnBackToMainPage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        tvDataReceived = findViewById(R.id.tv_data_received)
        DataReceived()

        btnBackToMainPage = findViewById(R.id.btn_backto_main_page)
        btnBackToMainPage.setOnClickListener(this)
    }

    private fun DataReceived() {
        val bundle = intent.extras
        val nama = bundle?.getString("Nama")
        val alamat = bundle?.getString("Alamat")

        tvDataReceived.text = nama + " " + alamat

    }

    override fun onClick(v: View?) {
        if (v != null){
            when (v.id) {
                R.id.btn_backto_main_page -> {
                    val intent = Intent(this, MoveActivity::class.java)
                    startActivity(intent)
                }
            }

        }
    }
}

class BackToMainPage{


}