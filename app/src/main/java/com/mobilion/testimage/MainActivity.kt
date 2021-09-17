package com.mobilion.testimage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.tabs.TabLayoutMediator
import com.mobilion.testimage.adapter.TabPagerAdapter
import com.mobilion.testimage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var pagerAdapter: TabPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        pagerAdapter = TabPagerAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = pagerAdapter

        TabLayoutMediator(binding.mainTabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = getString(R.string.trouble)
                }
                1 -> {
                    tab.text = getString(R.string.solution)
                }
                2 -> {
                    tab.text = getString(R.string.network)
                }
                3 -> {
                    tab.text = getString(R.string.card_image)
                }
            }
        }.attach()
    }
}
