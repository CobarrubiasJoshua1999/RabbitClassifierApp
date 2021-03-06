package com.example.breedapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.breedapp.databinding.FragmentMainMenuBinding
class MainMenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainMenuBinding>(inflater, R.layout.fragment_main_menu, container, false)
        binding.button5.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_mainMenuFragment_to_homeFragment) }

        binding.button3.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_mainMenuFragment_to_cameraClassifierFragment2)
        }







        return binding.root
    }



}