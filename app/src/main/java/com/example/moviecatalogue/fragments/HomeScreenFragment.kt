package com.example.moviecatalogue.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.moviecatalogue.interfaces.CellClickListener
import com.example.moviecatalogue.R
import com.example.moviecatalogue.adapter.ItemAdapter
import com.example.moviecatalogue.data.Datasource
import com.example.moviecatalogue.model.Movie

class HomeScreenFragment : Fragment(), CellClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home_screen, container, false)
//        view.findViewById<View>(R.id.listAddNewNote).setOnClickListener {
//            findNavController().navigate(R.id.action_listFragment_to_addFragment)
//        }
//
//        view.findViewById<View>(R.id.listLayout).setOnClickListener {
//            findNavController().navigate(R.id.action_listFragment_to_updateFragment)
//        }
        // TO DO
//        setNavigationOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.aboutScreenFragment)
//        }

        // Initialize data.
        val movieDataset = Datasource().loadMovies()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, movieDataset, this)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

        return view
    }

    override fun onCellClickListener(data: Movie) {
        view?.let { Navigation.findNavController(it).navigate(R.id.itemDetailsFragment) }
    }
}