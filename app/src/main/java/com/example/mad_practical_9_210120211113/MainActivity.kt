package com.example.mad_practical_9_210120211113

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.mad_practical_9_21012021113.R

class MainActivity : AppCompatActivity() {
    lateinit var alarmAnimationDrawable: AnimationDrawable
    lateinit var heartanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagealarm=findViewById<ImageView>(R.id.imageView)
        imagealarm.setBackgroundResource(R.drawable.alarm_animaton_list)
        alarmAnimationDrawable=imagealarm.background as AnimationDrawable

        val heart=findViewById<ImageView>(R.id.imageview1)
        heart.setBackgroundResource(R.drawable.heart_animation_list)
        heartanimation=heart.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus){
            alarmAnimationDrawable.start()
            heartanimation.start()
        }
        else{
            alarmAnimationDrawable.stop()
            heartanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }
}