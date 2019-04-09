package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.provider.AlarmClock.EXTRA_MESSAGE

import android.widget.EditText
import android.content.Intent




class MainActivity : AppCompatActivity() {
    public final val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button  */
    fun sendMessage(view: View) {
        // Do something in response to button
        val intent = Intent(this, DisplayMessageActivity::class.java)
        val editText = findViewById(R.id.editText) as EditText
        val message = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)

    }

}
