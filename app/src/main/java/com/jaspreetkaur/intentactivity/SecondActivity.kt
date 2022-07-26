package com.jaspreetkaur.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    var name: String = ""
    var age: String = ""
    var gender: String = ""
    var email: String = ""
   var number: String = ""
    var salary: String = ""
    var info: String = ""

    lateinit var tvName: TextView
    lateinit var tvAge: TextView
    lateinit var tvGender: TextView
    lateinit var tvMail: TextView
    lateinit var tvNumber: TextView
    lateinit var tvSalary: TextView
    lateinit var tvInfo: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

 //val intent = getIntent()
  intent?.let { i ->

          val name = intent.getDoubleExtra("name", 0.00)
       age = i.getIntExtra("age", 0)
        //      gender = i.getCharExtra("gender",)
      email = i.getStringExtra("email") as String
            //  val number = intent.getLongExtra("Number",)
            //  val salary = intent.getFloatExtra("Salary",)
            //  val info = intent.getBooleanExtra("Info",)


    } ?: kotlin.run { }
  //      tvName.setText(name)

      tvAge = findViewById(R.id.tvAge)
        tvMail = findViewById(R.id.tvMail)

     tvAge.setText(age)
        tvMail.setText(email)
    }
}
