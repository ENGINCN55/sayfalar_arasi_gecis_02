package com.example.navigation_companenet_sayfalar_arasi_gecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigation_companenet_sayfalar_arasi_gecis.databinding.FragmentSonucBinding
import com.example.navigation_companenet_sayfalar_arasi_gecis.databinding.FragmentSonucEkraniBinding


class sonuc_ekrani : Fragment() {
    private lateinit var navCohtroller: NavController
    private lateinit var binding: FragmentSonucEkraniBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navCohtroller= Navigation.findNavController(view)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSonucEkraniBinding.inflate(inflater,container,false)
        binding.kahveOldu.setOnClickListener {
            navCohtroller.navigate(R.id.to_sonuc2)
        }

        return binding.root
    }


}