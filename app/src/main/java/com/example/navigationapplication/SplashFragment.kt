package com.example.navigationapplication

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import androidx.navigation.Navigation


class SplashFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_splash, container, false)

        // home screen button
        val homeScreenBtn = view.findViewById(R.id.home_screen_button) as Button

        homeScreenBtn.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(view).navigate(R.id.homeScreenFragment)
        })

        val progressBar = view.findViewById(R.id.progressBar) as ProgressBar
        fun countDown() {
                object: CountDownTimer(10000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
    //                textField.setText("seconds remaining: " + millisUntilFinished / 1000)
    //                    setContentView(R.layout.fragment_spinner)
//                    var timeRemaining = (millisUntilFinished / 1000)
//                    progressBar.setProgress(timeRemaining.toInt())
                    progressBar.setProgress((millisUntilFinished / 1000).toInt())

                }
            override fun onFinish() {
//                textField.setText("done.")
//                    setContentView(R.layout.activity_main)
                Navigation.findNavController(view).navigate(R.id.homeScreenFragment)
            }
        }.start()
    }

        return view
    }
}

