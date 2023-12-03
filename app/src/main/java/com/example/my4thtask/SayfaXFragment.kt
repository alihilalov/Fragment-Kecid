package com.example.my4thtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.my4thtask.databinding.FragmentSayfaBinding
import com.example.my4thtask.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var binding: FragmentSayfaXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)
        binding.buttonXtoY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kecidY  )
        }

        return binding.root
    }
}