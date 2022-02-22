package com.example.lesson_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.IllegalStateException

class MainActivity : AppCompatActivity() {
    //В Котлине СВОЙСТВА!!:
    var i: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val objTest = Test()
        val getI = objTest.i
        objTest.i = 2
        this.i = 2

        this.i = try {
            throw IllegalStateException()
        }catch (e: IllegalStateException){
            3
        }

        Log.d("myLogs", "$i adssfv $i ${i}")
    }

}

class Test(){
    var i: Int = 0
}

fun test(): Int{
    var i: Int = 0
    return i
}
