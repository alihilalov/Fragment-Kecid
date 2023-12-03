package com.example.my4thtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.my4thtask.databinding.FragmentSayfaBinding

class SayfaFragment : Fragment() {
    private lateinit var binding: FragmentSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfaBinding.inflate(inflater, container, false)

        binding.buttonBb2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kecid2)

        }
        return binding.root
    }
}