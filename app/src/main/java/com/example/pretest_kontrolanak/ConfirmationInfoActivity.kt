package com.example.pretest_kontrolanak


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_confirmation_info.*

//Nim : 10117128
//Nama : Fikri Adriansa Yudha
//commit : 4 April 2020, set intent dari halaman KodeKeluargaActivity ke halaman UserRegistrationActivity, bikin layout User Registration, set Logic 6 character inputan dan all text Capslock default


class ConfirmationInfoActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation_info)

        val myIntent = intent
        tv_selesai_isi_data.text = "Beres! Sekarang " +myIntent.getStringExtra("NAMA_PANGGILAN")+ " udah bisa ngecek penggunaan HP " +myIntent.getStringExtra("NAMA_PANGGILAN")+ " tiap hari buat bantu "  +myIntent.getStringExtra("NAMA_PANGGILAN")+ " ngatur waktu :)"

        btn_oke.setOnClickListener {
            this.finish()
            finishAffinity()
        }

    }
}
