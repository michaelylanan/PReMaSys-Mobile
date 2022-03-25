package com.example.premasys.ui.rewards

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.premasys.R
import com.example.premasys.databinding.FragmentRewardsBinding
import com.example.premasys.ui.gallery.GalleryViewModel
import com.example.premasys.ui.gallery.RewardsViewModel

class RewardsFragment : Fragment() {

    companion object {
        fun newInstance() = RewardsFragment()
    }

    private lateinit var viewModel: RewardsViewModel
    private var _binding: FragmentRewardsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProvider(this).get(RewardsViewModel::class.java)

        _binding = FragmentRewardsBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textRewards
//        viewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

}