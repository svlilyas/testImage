package com.mobilion.testimage.extensions

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.santalu.aspectratioimageview.AspectRatioImageView
import com.squareup.picasso.Picasso

@BindingAdapter("app:imageUrl")
fun ImageView.loadImage(url: String?) {
    if (!url.isNullOrEmpty()) {
        Glide.with(this).load(url).into(this)
    }
}

@BindingAdapter("app:imageUrlGlide")
fun AspectRatioImageView.loadImageGlide(url: String?) {
    if (!url.isNullOrEmpty()) {
        /*Glide.with(this).load(url).placeholder(R.drawable.bmw_front_1_1920x1080)
            .error(R.drawable.ic_baseline_report_problem_24).into(this)
        */
        Glide.with(this).load(url).into(this)
    }
}

@BindingAdapter("app:imageUrlPicasso")
fun AspectRatioImageView.loadImagePicasso(url: String?) {
    if (!url.isNullOrEmpty()) {
        Picasso.get().load(url).into(this)
    }
}
