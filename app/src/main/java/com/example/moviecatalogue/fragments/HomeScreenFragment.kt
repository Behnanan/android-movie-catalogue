package com.example.moviecatalogue.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.moviecatalogue.interfaces.CellClickListener
import com.example.moviecatalogue.R
import com.example.moviecatalogue.adapter.ItemAdapter
import com.example.moviecatalogue.data.Datasource
import com.example.moviecatalogue.model.Movie
import android.util.Log
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

//class HomeScreenFragment : Fragment(), CellClickListener {
class HomeScreenFragment : Fragment() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setHasOptionsMenu(true)
//    }
    // Safe Args
    // private val args by navArgs<HomeScreenFragmentArgs>()
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        inflater.inflate(R.menu.alt_menu, menu)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home_screen, container, false)

        // Initialize data.
        val movieDataset = Datasource().loadMovies()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)

//        recyclerView.adapter = ItemAdapter(this, movieDataset, this)
        recyclerView.adapter = ItemAdapter(this, movieDataset)


        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
        activity?.actionBar?.setHomeButtonEnabled(false)
        activity?.actionBar?.setDisplayHomeAsUpEnabled(false)
        return view
    }

//    override fun onCellClickListener(data: Movie) {
//        view?.let { Navigation.findNavController(it).navigate(R.id.itemDetailsFragment) }
//    }
}