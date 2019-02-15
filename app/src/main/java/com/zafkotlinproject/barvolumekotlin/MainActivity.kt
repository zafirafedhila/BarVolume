package com.zafkotlinproject.barvolumekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnhitung.setOnClickListener {
        val panjang =edtpanjang.text.toString().toIntOrNull()
            val lebar = edtlebar.text.toString().toIntOrNull()
            if (panjang !=null && lebar!=null){
                val hasil = panjang* lebar!!
                tvhitung.text=hasil.toString()

            }else{
                edtpanjang.error="tidak boleh kosong"
            }
            if (lebar!=null){
        }else{
                edtlebar.error="tidak boleh kosong"
            }





}

    }
}
