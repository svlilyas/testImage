package com.mobilion.testimage.fakedata

data class CarImage(
    var id: Int = 0,
    var type: RequestType,
    var imgUrl: String = "",
    var title: String = ""
)

object CarImages {
    fun fakeDataHigh(): ArrayList<CarImage> {
        val list = arrayListOf(
            CarImage(
                0,
                RequestType.GLIDE,
                "https://i.ibb.co/rGqKRhH/bmw-front-2-1920x1080.jpg"
            ),
            CarImage(
                1,
                RequestType.GLIDE,
                "https://i.ibb.co/rZ6TJqf/bmw-front-left-1920x1080.jpg"
            ),
            CarImage(
                2,
                RequestType.GLIDE,
                "https://i.ibb.co/9W7mqGh/bmw-front-right-1920x1080.jpg"
            ),
            CarImage(
                3,
                RequestType.GLIDE,
                "https://i.ibb.co/LpzDyN0/bmw-inside-1-1920x1080.jpg"
            ),
            CarImage(
                4,
                RequestType.GLIDE,
                "https://i.ibb.co/hBwbzrG/bmw-inside-2-1920x1080.jpg"
            ),
            CarImage(
                5,
                RequestType.PICASSO,
                "https://i.ibb.co/SfQggpw/bmw-inside-3-1920x1080.jpg"
            ),
            CarImage(
                6,
                RequestType.PICASSO,
                "https://i.ibb.co/JqR70WS/bmw-left-side-1920x1080.jpg"
            ),
            CarImage(
                7,
                RequestType.PICASSO,
                "https://i.ibb.co/PjDPhHs/bmw-street-1920x1080.jpg"
            ),
            CarImage(
                8,
                RequestType.PICASSO,
                "https://i.ibb.co/9ZTVsDx/bmw-wide-1920x1080.jpg"
            ),
            CarImage(
                9,
                RequestType.PICASSO,
                "https://i.ibb.co/Jd5Z3cR/bmw-front-1-1920x1080.jpg"
            )
        )

        list.forEach {
            it.title = "[1920X1080] ${it.type.name}"
        }

        return list
    }

    fun fakeDataMid(): ArrayList<CarImage> {
        val list = arrayListOf(
            CarImage(
                0,
                RequestType.GLIDE,
                "https://i.ibb.co/VqfD0C1/bmw-wide-1280x720.jpg"
            ),
            CarImage(
                1,
                RequestType.GLIDE,
                "https://i.ibb.co/JtZTR0T/bmw-front-1-1280x720.jpg"
            ),
            CarImage(
                2,
                RequestType.GLIDE,
                "https://i.ibb.co/HX4HHM7/bmw-front-2-1280x720.jpg"
            ),
            CarImage(
                3,
                RequestType.GLIDE,
                "https://i.ibb.co/m5WtF9N/bmw-front-left-1280x720.jpg"
            ),
            CarImage(
                4,
                RequestType.GLIDE,
                "https://i.ibb.co/ZLkDSS0/bmw-front-right-1280x720.jpg"
            ),
            CarImage(
                5,
                RequestType.PICASSO,
                "https://i.ibb.co/m893PcP/bmw-street-1280x720.jpg"
            ),
            CarImage(
                6,
                RequestType.PICASSO,
                "https://i.ibb.co/tqZb2Zk/bmw-inside-1-1280x720.jpg"
            ),
            CarImage(
                7,
                RequestType.PICASSO,
                "https://i.ibb.co/y8Tr1bQ/bmw-inside-2-1280x720.jpg"
            ),
            CarImage(
                8,
                RequestType.PICASSO,
                "https://i.ibb.co/KWnW8m3/bmw-inside-3-1280x720.jpg"
            ),
            CarImage(
                9,
                RequestType.PICASSO,
                "https://i.ibb.co/FqzL2Sg/bmw-left-side-1280x720.jpg"
            )
        )

        list.forEach {
            it.title = "[1280X720] ${it.type.name}"
        }

        return list
    }

    fun fakeDataLow(): ArrayList<CarImage> {
        val list = arrayListOf(
            CarImage(
                0,
                RequestType.GLIDE,
                "https://i.ibb.co/VWyDXNw/bmw-front-1-1024x576.jpg"
            ),
            CarImage(
                1,
                RequestType.GLIDE,
                "https://i.ibb.co/ZVsct0w/bmw-front-2-1024x576.jpg"
            ),
            CarImage(
                2,
                RequestType.GLIDE,
                "https://i.ibb.co/zJQQQ5R/bmw-front-left-1024x576.jpg"
            ),
            CarImage(
                3,
                RequestType.GLIDE,
                "https://i.ibb.co/L91xBZX/bmw-front-right-1024x576.jpg"
            ),
            CarImage(
                4,
                RequestType.GLIDE,
                "https://i.ibb.co/TqzgMDp/bmw-inside-1-1024x576.jpg"
            ),
            CarImage(
                5,
                RequestType.PICASSO,
                "https://i.ibb.co/Z1KTBfx/bmw-inside-2-1024x576.jpg"
            ),
            CarImage(
                6,
                RequestType.PICASSO,
                "https://i.ibb.co/tLdpw4x/bmw-inside-3-1024x576.jpg"
            ),
            CarImage(
                7,
                RequestType.PICASSO,
                "https://i.ibb.co/T4bcmJP/bmw-left-side-1024x576.jpg"
            ),
            CarImage(
                8,
                RequestType.PICASSO,
                "https://i.ibb.co/WFxhGhp/bmw-street-1024x576.jpg"
            ),
            CarImage(
                9,
                RequestType.PICASSO,
                "https://i.ibb.co/hYJCTck/bmw-wide-1024x576.jpg"
            )
        )

        list.forEach {
            it.title = "[1024X576] ${it.type.name}"
        }

        return list
    }
}
