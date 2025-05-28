package com.example.classfragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.classfragments.databinding.ActivityMainBinding
import com.example.classFragments.fragments.FragmentOne
import com.example.classfragments.fragments.FragmentTwo
import com.example.classfragments.fragments.FragmentThree

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Load default fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentOne())
            .commit()

        binding.btnFragmentOne.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentOne())
                .commit()
        }

        binding.btnFragmentTwo.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentTwo())
                .commit()
        }

        binding.btnFragmentThree.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentThree())
                .commit()
        }
    }
}
