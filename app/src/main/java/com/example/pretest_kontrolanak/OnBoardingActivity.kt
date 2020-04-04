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
        //commit : 4 April 2020, set intent dari halaman KodeKeluargaActivity ke halaman UserRegistrationActivity, bikin layout User Registration, set Logic 6 character inputan dan all text Capslock default
        btn_mulai.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, KodeKeluargaActivity::class.java)
            startActivity(intent)
        }
    }
}
