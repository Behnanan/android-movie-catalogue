package com.example.navigationapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.navigationapplication.toolbar.FragmentToolbar
import com.example.navigationapplication.toolbar.ToolbarManager

abstract class BaseFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ToolbarManager(toolbarBuilder(), view).prepareToolbar()
    }

    protected abstract fun toolbarBuilder(): FragmentToolbar
}

