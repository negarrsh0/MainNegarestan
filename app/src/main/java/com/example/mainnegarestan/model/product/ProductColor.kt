package com.example.mainnegarestan.model.product

data class ProductColor(
    var id: Long,
    var hexValue: String? = "",
    var title:String?= "",
    var code : String? ="",
    var weight : String? ="",
    var dimensions : String? ="",
    var size : String? ="",
    var color : String? ="",
    var shape : String? ="",
    var image : String? ="",
    var attribute : String? ="",
    var visitCount : Long? = null,
    var addDate : String? ="",
    var category : String? ="",
    var property : String? ="",
    var description : String? ="",
    var price : String? ="",
    var quantity : String? ="",
)
