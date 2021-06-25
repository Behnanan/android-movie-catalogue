package com.example.navigationapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationapplication.adapter.ItemAdapter
import com.example.navigationapplication.data.Datasource
import com.example.navigationapplication.toolbar.FragmentToolbar

class HomeScreenFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home_screen, container, false)
        val toolbar: Toolbar = view.findViewById(R.id.home_screen_toolbar)

        toolbar.setNavigationIcon(R.drawable.baseline_more_vert_24)
        toolbar.setNavigationOnClickListener {
            Navigation.findNavController(view).navigate(R.id.aboutScreenFragment)
        }

        // Initialize data.
        val movieDataset = Datasource().loadMovies()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, movieDataset)


        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
        return view
    }

    override fun toolbarBuilder(): FragmentToolbar {
        return FragmentToolbar.Builder()
            .withId(R.id.home_screen_toolbar)
            .withMenu(R.menu.home_screen_menu)
            .build()
    }
}