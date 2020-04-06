package com.example.pretest_kontrolanak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_oboarding.*
//Nim : 10117128
//Nama : Fikri Adriansa Yudha
//IF4
//commit : 5 April 2020, set intent dari halaman UserRegistrationActivity ke halaman ConfirmationInfoActivity, bikin layoutConfirmationInfoActivity, pass value edit text nama panggilan menggunakan putExtra
class OnBoardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oboarding)

        btn_mulai.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, KodeKeluargaActivity::class.java)
            startActivity(intent)
        }
    }
}
