package com.example.navigation_companenet_sayfalar_arasi_gecis

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigation_companenet_sayfalar_arasi_gecis.databinding.FragmentOyunEkraniBinding


class oyun_ekrani : Fragment() {
    private lateinit var navCohtroller: NavController
    private lateinit var binding: FragmentOyunEkraniBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navCohtroller= Navigation.findNavController(view)


    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bundle:oyun_ekraniArgs by navArgs()
        val gelenAd=bundle.ad
        val gelenyas=bundle.yas
        val gelenboy=bundle.boy

        Log.e("ad",gelenAd)
        Log.e("yas",gelenyas.toString())
        Log.e("boy",gelenboy.toString())
        binding= FragmentOyunEkraniBinding.inflate(inflater,container,false)
        binding.yumurtaOldu.setOnClickListener {
            navCohtroller.navigate(R.id.to_sonuc)

        }




        return binding.root
    }


}