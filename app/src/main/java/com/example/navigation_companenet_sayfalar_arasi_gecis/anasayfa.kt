package com.example.navigation_companenet_sayfalar_arasi_gecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigation_companenet_sayfalar_arasi_gecis.databinding.FragmentAnasayfaBinding

class anasayfa : Fragment() {
    private lateinit var navCohtroller:NavController
    private lateinit var binding: FragmentAnasayfaBinding
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
    ): View {
        binding=FragmentAnasayfaBinding.inflate(inflater,container,false)
        binding.yumurta.setOnClickListener {
            Toast.makeText(context,"yumurta yapımına geçiyorsunuz",Toast.LENGTH_LONG).show()

            val gecis=anasayfaDirections.yumurtaGecis("ahmet",18,170.0F)
            navCohtroller.navigate(gecis)


        }
        binding.kahve.setOnClickListener {
            Toast.makeText(context,"kahve yapımına geçiyorsunuz",Toast.LENGTH_LONG).show()

            navCohtroller.navigate(R.id.kahve_gecis)

        }


        return binding.root
    }


}


