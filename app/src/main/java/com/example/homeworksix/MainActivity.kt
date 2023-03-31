package com.example.homeworksix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    var numbers = arrayOf(9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233)
    var numbersSecond = arrayOf(10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sort()
        sortTwo()
    }

    fun sort() {
        numbers.sort()
        println(numbers.contentToString())
    }


    fun sortTwo() {


        for (i in numbersSecond) {
            if (i % 2 == 0) {
                println(" чет" + i)
            } else {
                println(" нечет" + i) 
            }
        }
    }
}



