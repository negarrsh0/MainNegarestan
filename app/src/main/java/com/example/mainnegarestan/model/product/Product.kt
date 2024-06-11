package com.example.mainnegarestan.model.product

import okhttp3.RequestBody

data class Product(
    var id: Long,
    var title: String? ="",
    var category: String? ="",
    var code: String? ="",
    var weight: String? ="",
    var dimention: String? ="",
    var size: String? ="",
    var color: String? ="",
    var shape: String? ="",
    var quantity: String? ="",
    var visitCount: String = "",
    var addDate: String? ="",
    var property: String? ="",
    var description: String? ="",
    var price: String? ="",
    var quality:String?= "",
    var density:String?= "",
    var densityInHeight: String? ="",
    var densityInWidth: String? ="",
    var khabType: String? ="",
    var poodType: String? ="",
    var tarType: String? ="",
    var tissueLocation: String? ="",
    var tissuDensityIn7cm: String?= "",
    var tissueType: String? ="",
    var threadType: String? ="",
    var thickness: String? ="",
    var numcolor: String? ="",
    var frameType: String? ="",
    var layernum: String? ="",
    var tablosize: String? ="",
    var rangType: String? ="",
    var dimentionFrame: String? ="",
    var porzType: String? = "",
    var image: String= "",
    var user_id:Long

    )