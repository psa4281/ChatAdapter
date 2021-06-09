package com.example.recyclerviewstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val chatAdapter=chatAdapter()
    val chats=ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chats.add(Chat("리본","안녕"))
        chats.add(Chat("리본","반가워"))
        chats.add(Chat("다리우스","ㅎㅇㅎㅇ"))
        chats.add(Chat("다리우스","방가방가"))

        rv_main_chat.apply{
            layoutMa
        }
    }
}