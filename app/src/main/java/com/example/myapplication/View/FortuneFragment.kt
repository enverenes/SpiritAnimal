package com.example.myapplication.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.Model.SpiritAnimal

import com.example.myapplication.R

/**
 * A simple [Fragment] subclass.
 * Use the [FortuneFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FortuneFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view2 = inflater.inflate(R.layout.fragment_fortune, container, false)

        val YourAnimal = SpiritAnimal()
        val FortuneText = view2.findViewById<TextView>(R.id.txtFortune)
        FortuneText.text = YourAnimal.fortune.toString()

        val AnimalNameText = view2.findViewById<TextView>(R.id.txtSpiritAnimal)
        FortuneText.text = YourAnimal.name.toString()

        val btnToFortune = view2.findViewById<Button>(R.id.btn_to_home)
        btnToFortune.setOnClickListener(){
            Navigation.findNavController(view2).navigate(R.id.navigate_to_home)
        }
        return view2
    }


}