package com.example.navigationapplication.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationapplication.HomeScreenFragment
import com.example.navigationapplication.R
import com.example.navigationapplication.model.Movie

/**
 * Adapter for the [RecyclerView] in [HomeScreenFragment]. Displays [Movie] data object.
 */

class ItemAdapter(
    private val context: HomeScreenFragment,
    private val dataset: List<Movie>,
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        with(holder.imageView) {
            setOnClickListener(mOnClickListener)
        }
    }
    private val mOnClickListener: View.OnClickListener
        init {
            mOnClickListener = View.OnClickListener { v ->
                println("Movie Clicked")
            }
        }

    //    /**
    //     * Return the size of your dataset (invoked by the layout manager)
    //     */
    override fun getItemCount() = dataset.size

}