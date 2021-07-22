package com.example.moviecatalogue.interfaces

import com.example.moviecatalogue.model.Movie

interface CellClickListener {
    fun onCellClickListener(data: Movie)
}