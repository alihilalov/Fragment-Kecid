package com.example.my4thtask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my4thtask.databinding.FragmentSayfaBinding
import com.example.my4thtask.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {
    private lateinit var binding: FragmentSayfaYBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        binding
        return binding.root
    }
}