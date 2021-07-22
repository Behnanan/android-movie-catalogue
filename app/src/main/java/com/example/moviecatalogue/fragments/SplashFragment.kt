package com.example.moviecatalogue.fragments

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.moviecatalogue.R

class SplashFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_splash, container, false)

        view.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(view).navigate(R.id.homeScreenFragment)
        })

        return view
    }
}

