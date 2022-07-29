package com.jaspreetkaur.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    var name: String =""
    var age: Int = 0
   var gender: String = ""
    var id: Double = 0.0
    var number: Long = 0
    var salary: Float = 0.0F
    var info: Boolean = true

    lateinit var tvName: TextView
    lateinit var tvAge: TextView
    lateinit var tvGender: TextView
   lateinit var tvID: TextView
    lateinit var tvNumber: TextView
    lateinit var tvSalary: TextView
    lateinit var tvInfo: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tvName = findViewById(R.id.tvName)
        tvAge = findViewById(R.id.tvAge)
     tvGender = findViewById(R.id.tvGender)
        tvID = findViewById(R.id.tvID)
        tvNumber = findViewById(R.id.tvNumber)
        tvSalary = findViewById(R.id.tvSalary)
        tvInfo = findViewById(R.id.tvInfo)


  intent?.let {

    name = it.getStringExtra("name").toString()
       age = it.getIntExtra("age", 0)
   gender = it.getStringExtra("gender").toString()
      id = it.getDoubleExtra("id",0.00)
   number =it.getLongExtra("Number",0)
     salary = it.getFloatExtra("Salary",0.0F)
      info = it.getBooleanExtra("Info",true)


    }

       tvName.setText(name)
        tvAge.setText(age.toString())
     tvGender.setText(gender)
        tvID.setText(""+id.toString())
       tvNumber.setText(""+number.toString())
        tvSalary.setText(""+salary.toString())
        tvInfo.setText(""+info.toString())

    }
}
