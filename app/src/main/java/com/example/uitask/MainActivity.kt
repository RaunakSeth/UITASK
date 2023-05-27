package com.example.uitask

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rando:TextView=findViewById(R.id.textView)
        val date:TextView=findViewById(R.id.textView4)
        val c = Calendar.getInstance()

        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        val month_date = SimpleDateFormat("MMMM")
        val monthnum = 5
        c.set(Calendar.MONTH, monthnum)
        val month_name: String = month_date.format(c.getTime())
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)
        val dateString=month_name+" "+day+","+year+" "+hour+":"+minute+" Hrs"
        date.setText(dateString)
        val random=(999..99999).shuffled().last()
        rando.setText(random.toString())
    }

}