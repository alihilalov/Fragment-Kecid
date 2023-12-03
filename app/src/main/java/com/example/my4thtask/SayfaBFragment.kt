package com.example.my4thtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.my4thtask.databinding.FragmentSayfaBBinding
import com.example.my4thtask.databinding.FragmentSayfaBinding
class SayfaBFragment : Fragment() {
    private lateinit var binding: FragmentSayfaBBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)
        binding.buttonYY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kecidFromBtoY)
        }

        return binding.root
    }
}