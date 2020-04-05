package com.example.pretest_kontrolanak

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
//Nim : 10117128
//Nama : Fikri Adriansa Yudha
//commit : 5 April 2020, set intent dari halaman UserRegistrationActivity ke halaman ConfirmationInfoActivity, bikin layoutConfirmationInfoActivity, pass value edit text nama panggilan menggunakan putExtra

class UserRegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_registration)

        //init the edittext
        val etNama = findViewById<EditText>(R.id.et_nama_panggilan)
        val etUmur = findViewById<EditText>(R.id.et_umur)
        //init the button
        val btnClick = findViewById<Button>(R.id.btn_selanjutnya)

        var boolIntentNama: Boolean
        var boolIntentUmur: Boolean

        btnClick.setOnClickListener{

            boolIntentNama = validate(arrayOf(etNama))
            boolIntentUmur = validate(arrayOf(etUmur))

            if (boolIntentNama && boolIntentUmur){
                val strNama: String = etNama.text.toString()
                val strUmur: String = etUmur.text.toString()

                val intent = Intent(this, ConfirmationInfoActivity::class.java)
                intent.putExtra("NAMA_PANGGILAN", strNama)
                intent.putExtra("UMUR", strUmur)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Ayo isi nama panggilan dan umurmu! ", Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun validate(fields: Array<EditText>): Boolean {
        for (i in fields.indices) {
            val currentField = fields[i]
            if (currentField.text.toString().isEmpty()) {
                return false
            }
        }
        return true
    }
}
