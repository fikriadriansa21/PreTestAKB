package com.example.pretest_kontrolanak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_oboarding.*

class OnBoardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oboarding)
        //Nim : 10117128
        //Nama : Fikri Adriansa Yudha
        //commit : 3 April 2020, set intent dari halaman sambutan ke halaman kode keluarga, bikin layout tampilan pembuka (awal), nambahin empty activity KodeKeluargaActivity
        btn_masuk.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, KodeKeluargaActivity::class.java)
            startActivity(intent)
        }
    }
}
