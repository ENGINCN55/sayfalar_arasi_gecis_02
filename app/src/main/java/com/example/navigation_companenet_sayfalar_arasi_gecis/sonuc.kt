package com.example.navigation_companenet_sayfalar_arasi_gecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigation_companenet_sayfalar_arasi_gecis.databinding.FragmentSonucBinding


class sonuc : Fragment() {
    private lateinit var binding:FragmentSonucBinding
    private lateinit var navCohtroller: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navCohtroller=Navigation.findNavController(view)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSonucBinding.inflate(inflater,container,false)





        return binding.root
    }



}