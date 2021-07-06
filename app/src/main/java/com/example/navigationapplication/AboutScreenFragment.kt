package com.example.navigationapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import com.example.navigationapplication.toolbar.FragmentToolbar

class AboutScreenFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_about_screen, container, false)
        val toolbar: Toolbar = view.findViewById(R.id.about_screen_toolbar)

        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24)
        toolbar.setNavigationOnClickListener {
            Navigation.findNavController(view).navigate(R.id.homeScreenFragment)
        }
        return view
    }

    override fun toolbarBuilder(): FragmentToolbar {
        return FragmentToolbar.Builder()
            .withId(R.id.about_screen_toolbar)
            .build()
    }
}


