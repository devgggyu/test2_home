package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       loginBtn.setOnClickListener {

           val inputId = emailEdt.text.toString()
           val inputPw = passwordEdt.text.toString()

           if ( inputId == "daegu776@gmail.com" && inputPw =="qwer") {
               Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
           }

           else {
               Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
           }





       }
    }
}