package com.mobilion.testimage.tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.mobilion.testimage.R
import com.mobilion.testimage.adapter.FullWidthImageAdapter
import com.mobilion.testimage.databinding.FragmentNetworkImageBinding
import com.mobilion.testimage.fakedata.CarImages

class NetworkImageFragment : Fragment() {

    private lateinit var binding: FragmentNetworkImageBinding
    private lateinit var imageAdapter: FullWidthImageAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_network_image, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageAdapter = FullWidthImageAdapter(CarImages.fakeDataHigh())
        binding.apply {
            recyclerView.adapter = imageAdapter
        }
    }
}
