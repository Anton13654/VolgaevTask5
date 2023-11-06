package com.aeincprojects.volgaevtask5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.aeincprojects.volgaevtask5.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {


    private val binding: FragmentMainBinding by viewBinding(FragmentMainBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentManager = childFragmentManager

        binding.firstButton.setOnClickListener {
            val fragment = FirstFragment()
            fragmentManager.beginTransaction()
                .replace(R.id.personal_container, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.secondButton.setOnClickListener {
            val fragment = SecondFragment()
            fragmentManager.beginTransaction()
                .replace(R.id.personal_container, fragment)
                .addToBackStack(null)
                .commit()
        }
        binding.thirdButton.setOnClickListener {
            val fragment = ThirdFragment()
            fragmentManager.beginTransaction()
                .replace(R.id.personal_container, fragment)
                .addToBackStack(null)
                .commit()
        }
    }
}