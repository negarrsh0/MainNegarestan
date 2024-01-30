package com.example.mainnegarestan.model.product

data class CarpetPanel(
    var id: Long,
    var tissueLocation: String? = "",
    var tissueType: String? = "",
    var tissueDensityIn7CM: String? = "",
    var khabType: String? = "",
    var tarType: String? = "",
    var poodType: String? = "",
    var densityInHeight: String? = "",
    var densityInWidth: String? = "",
    var frameType: String? = "",
    var product_id : Long? = null,
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