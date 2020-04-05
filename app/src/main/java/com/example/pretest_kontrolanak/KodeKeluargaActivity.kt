package com.example.pretest_kontrolanak


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kode_keluarga.*



class KodeKeluargaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode_keluarga)

        //init the edittext
        val etReferalKode = findViewById(R.id.et_kode_referal) as EditText
        //init the button
        val btnClick = findViewById(R.id.btn_masuk) as Button

        btnClick.setOnClickListener{
            //read value from EditText to a String variable
            val msg: String = etReferalKode.text.toString()

            //check if the EditText have values or not
            if(msg.trim().length>0) {
                val intent = Intent(this, UserRegistrationActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Mohon masukkan kode referal! ", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
