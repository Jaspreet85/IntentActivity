package com.jaspreetkaur.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etAge: EditText
    lateinit var etGender: EditText
    lateinit var etID: EditText
    lateinit var etNumber: EditText
    lateinit var etSalary : EditText
    lateinit var etInfo : EditText
    lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etAge = findViewById(R.id.etAge)
        etGender = findViewById(R.id.etGender)
        etID = findViewById(R.id.etID)
        etNumber = findViewById(R.id.etNumber)
        etSalary = findViewById(R.id.etSalary)
        etInfo = findViewById(R.id.etInfo)

        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {

            var intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("name", etName.text.toString())
            intent.putExtra("age", Integer.parseInt(etAge.text.toString()))
            intent.putExtra("gender", etGender.text.toString())
            intent.putExtra("email", (etID.text.toString()).toDouble())
            intent.putExtra("number", (etNumber.text.toString()).toLong())
            intent.putExtra("salary", (etSalary.text.toString()).toFloat())
            intent.putExtra("info",(etInfo.text.toString()).toBoolean())
            startActivity(intent)
        }
    }
}
