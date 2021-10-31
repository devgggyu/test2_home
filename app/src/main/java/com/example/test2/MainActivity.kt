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
//         로그인 버튼이 눌렸을때

           val inputId = emailEdt.text.toString()
           val inputPw = passwordEdt.text.toString()

//         아이디 비번 변수 선언

           if ( inputId == "daegu776@gmail.com" && inputPw =="qwer") {
               Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
           }
//           if문 작성

           else {
               Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
           }
//           조건이 틀렷을때



       }
    }
}