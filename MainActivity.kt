package com.example.assignment1


import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    private var countDownTimer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var timeMillis: Long = 60000

        countDownTimer = object : CountDownTimer(timeMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // This method will be called every second (1000 milliseconds) until the countdown is finished
                var secondsUntilFinished = millisUntilFinished / 1000
                // Update UI to display remaining time
                updateTimerUI(secondsUntilFinished)
            }

            override fun onFinish() {
                // This method will be called when the countdown timer is finished
                // Perform any actions needed when the timer finishes
                timerFinished()
            }


        }

        (countDownTimer as CountDownTimer).start()
    }

    private fun updateTimerUI(secondsUntilFinished: Long) {
        // Update your UI to display the remaining time
        // For example, update a TextView with the remaining time
        val textViewTimer = findViewById<TextView>(R.id.countdown2)
        textViewTimer.text = "$secondsUntilFinished"
    }

    private fun timerFinished() {
        // Perform any actions needed when the timer finishes
        // For example, display a message or start a new activity
        Toast.makeText(this@MainActivity, "Timer Finished!", Toast.LENGTH_SHORT).show()
    }

}