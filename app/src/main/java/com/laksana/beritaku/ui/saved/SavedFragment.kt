package com.laksana.beritaku.ui.saved

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.laksana.beritaku.MainActivity
import com.laksana.beritaku.databinding.FragmentSavedBinding
import com.laksana.beritaku.ui.news.NewsViewModel

class SavedFragment : Fragment() {

    private var _binding: FragmentSavedBinding? = null
    lateinit var viewModel: NewsViewModel

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSavedBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}