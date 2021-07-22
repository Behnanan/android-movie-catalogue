package com.example.moviecatalogue.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.moviecatalogue.R

class AboutScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_about_screen, container, false)

        // To DO
//        setNavigationOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.homeScreenFragment)
//        }
        return view
    }

}


