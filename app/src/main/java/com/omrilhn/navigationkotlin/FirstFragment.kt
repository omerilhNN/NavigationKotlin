package com.omrilhn.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.omrilhn.navigationkotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding : FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("Faruk")
            Navigation.findNavController(it).navigate(action)//findNavController: where we are
            //navigate: go to selected destination
        }
    }
}