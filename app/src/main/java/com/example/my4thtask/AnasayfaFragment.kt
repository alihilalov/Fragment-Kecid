package com.example.my4thtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.my4thtask.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =FragmentAnasayfaBinding.inflate(inflater, container, false)
        binding.buttonGotoA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.ayaKecid)

        }
        binding.buttonGotoX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kecidX)
        }
        return binding.root
    }

}