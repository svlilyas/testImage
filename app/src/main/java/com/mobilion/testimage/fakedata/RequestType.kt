package com.mobilion.testimage.fakedata

enum class RequestType(val value: Int) {
    GLIDE(0),
    PICASSO(1);

    companion object {
        fun find(value: Int) = when (value) {
            0 -> GLIDE
            1 -> PICASSO
            else -> throw Exception()
        }
    }
}
