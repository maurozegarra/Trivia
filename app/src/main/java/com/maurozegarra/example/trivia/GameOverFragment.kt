package com.maurozegarra.example.trivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.maurozegarra.example.trivia.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = FragmentGameOverBinding.inflate(inflater, container, false)
        binding.tryAgainButton.setOnClickListener {
            findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
        }
        return binding.root
    }
}
