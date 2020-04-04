package com.example.pretest_kontrolanak
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kode_keluarga.*


class KodeKeluargaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode_keluarga)
        //Nim : 10117128
        //Nama : Fikri Adriansa Yudha
        //commit : 4 April 2020, set intent dari halaman KodeKeluargaActivity ke halaman UserRegistrationActivity, bikin layout User Registration, set Logic 6 character inputan dan all text Capslock default
        btn_masuk.setOnClickListener {
            val intent = Intent(this, UserRegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}
