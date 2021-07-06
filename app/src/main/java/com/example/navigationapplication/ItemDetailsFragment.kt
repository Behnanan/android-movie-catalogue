package com.example.navigationapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import com.example.navigationapplication.toolbar.FragmentToolbar

class ItemDetails : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_item_details, container, false)
        val toolbar: Toolbar = view.findViewById(com.example.navigationapplication.R.id.item_details_toolbar)

        toolbar.setNavigationIcon(com.example.navigationapplication.R.drawable.baseline_arrow_back_24)
        toolbar.setNavigationOnClickListener {
            Navigation.findNavController(view).navigate(com.example.navigationapplication.R.id.homeScreenFragment)
        }
        return view
    }

    override fun toolbarBuilder(): FragmentToolbar {
        return FragmentToolbar.Builder()
            .withId(R.id.item_details_toolbar)
            .build()
    }
}