package com.mobilion.testimage.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mobilion.testimage.tabs.CardImageFragment
import com.mobilion.testimage.tabs.NetworkImageFragment
import com.mobilion.testimage.tabs.SolveImageFragment
import com.mobilion.testimage.tabs.TroubleImageFragment

class TabPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                TroubleImageFragment()
            }
            1 -> {
                SolveImageFragment()
            }
            2 -> {
                NetworkImageFragment()
            }
            3 -> {
                CardImageFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}
