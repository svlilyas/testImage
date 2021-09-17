package com.mobilion.testimage.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobilion.testimage.databinding.ItemCarFullWidthBinding
import com.mobilion.testimage.extensions.loadImageGlide
import com.mobilion.testimage.extensions.loadImagePicasso
import com.mobilion.testimage.fakedata.CarImage
import com.mobilion.testimage.fakedata.RequestType
import com.mobilion.testimage.platform.BaseListAdapter
import com.mobilion.testimage.platform.BaseViewHolder

class FullWidthImageAdapter(
    private var carImages: ArrayList<CarImage>,
) : BaseListAdapter<CarImage>(

    itemsSame = { old, new -> old == new },
    contentsSame = { old, new -> old == new }
) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        inflater: LayoutInflater,
        viewType: Int
    ): RecyclerView.ViewHolder {
        return ImageViewHolder(parent, inflater)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ImageViewHolder -> {
                holder.bind(carImages[position])
            }
        }
    }

    fun addData(addData: List<CarImage>) {
        carImages = addData as ArrayList<CarImage>
    }

    override fun getItemCount(): Int {
        return carImages.size
    }
}

class ImageViewHolder(parent: ViewGroup, inflater: LayoutInflater) :
    BaseViewHolder<ItemCarFullWidthBinding>(
        ItemCarFullWidthBinding.inflate(inflater, parent, false)
    ) {
    fun bind(carImage: CarImage) {
        binding.apply {
            item = carImage

            when (carImage.type) {
                RequestType.GLIDE -> imageView.loadImageGlide(carImage.imgUrl)
                RequestType.PICASSO -> imageView.loadImagePicasso(carImage.imgUrl)
            }
            executePendingBindings()
        }
    }
}
