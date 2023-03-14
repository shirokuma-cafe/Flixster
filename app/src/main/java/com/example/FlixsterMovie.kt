package com.example

import com.google.gson.annotations.SerializedName

class FlixsterMovie {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    @SerializedName("overview")
    var description: String? = null

}
