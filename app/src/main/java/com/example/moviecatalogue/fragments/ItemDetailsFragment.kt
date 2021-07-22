package com.example.moviecatalogue.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moviecatalogue.R

class ItemDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_item_details, container, false)

        // TO DO
//        setNavigationOnClickListener {
//            Navigation.findNavController(view).navigate(com.example.navigationapplication.R.id.homeScreenFragment)
//        }
        return view
    }
}