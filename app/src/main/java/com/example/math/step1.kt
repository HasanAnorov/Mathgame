package com.example.math

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_step1.*
import java.util.*

class step1 : AppCompatActivity() {

    private val random = Random()
    private var count =2
    private var score_count=1
    private var res :Int =0
    private var currentLevelCount=1
    companion object{
        const val LEVEL_COUNT =7
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step1)
        generatequestions()
    }


    fun onClick (view :View ){
val selectedButtons =(view as Button).text.toString().toInt()
        if(selectedButtons==res){
            generatequestions()
            questionsCount.text="Question $count"
            score.text="Your score $score_count"
            count++
            score_count++
        }
        else {

            val move_fail = Intent(this, failed::class.java)
            startActivity(move_fail)
            finish()
        }

        if(currentLevelCount== LEVEL_COUNT){
            val move_win =Intent(this, win_window::class.java)
            startActivity(move_win)
            finish()

        }
    }

    fun generatequestions(){

        var firstnumber :Int=random.nextInt(100)
        val secondnumber: Int =random.nextInt(100)

        when(random.nextInt(4)){

            0-> {
                txQuestion.text = "$firstnumber + $secondnumber"
                res = firstnumber + secondnumber
            }

            1-> {
                txQuestion.text = "$firstnumber - $secondnumber"
                res = firstnumber - secondnumber
            }

            2-> {
                txQuestion.text = "$firstnumber * $secondnumber"
                res = firstnumber * secondnumber
            }

            3-> {
                res = random.nextInt(100)
                firstnumber=res*secondnumber
                txQuestion.text="$firstnumber / $secondnumber"
            }

            }

        val correctanswerposition :Int =random.nextInt(4)
        val plusorminus :Boolean=random.nextBoolean()
        when(plusorminus){
     true ->{
         ans1.text=(res+random.nextInt(10)+1).toString()
     }
            false ->{
                ans1.text=(res-random.nextInt(10)-1).toString()
            }
        }

        when(plusorminus){
            true ->{
                ans2.text=(res+random.nextInt(10)+1).toString()
            }
            false ->{
                ans2.text=(res-random.nextInt(10)-1).toString()
            }
        }

        when(plusorminus){
            true ->{
                ans3.text=(res+random.nextInt(10)+1).toString()
            }
            false ->{
                ans3.text=(res-random.nextInt(10)-1).toString()
            }
        }

        when(plusorminus){
            true ->{
                ans4.text=(res+random.nextInt(10)+1).toString()
            }
            false ->{
                ans4.text=(res-random.nextInt(10)-1).toString()
            }
        }

        when(correctanswerposition){
            0 -> ans1.text=res.toString()
            1 -> ans2.text=res.toString()
            2 -> ans3.text=res.toString()
            3 -> ans4.text=res.toString()
        }

        }

    }


