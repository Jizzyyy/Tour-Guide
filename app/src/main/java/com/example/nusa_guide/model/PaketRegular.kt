package com.example.nusa_guide.model

data class PaketRegular(
    val id: Int,
    val nama: String,
    val gambar: Int,
    val harga: Int,
    val hariBerlibur: String? = null,
    val jarak: Double,
    val deskripsi: String? = null,
    val cuplikanPhotos: List<Int>? = null,
    val informasiTourGuide: String? = null,
    val informasiHarga: String? = null,
    val ratingReview: Float? = null,
    val ulasan: List<Ulasan>? = null,
    val informasiPaket: InformasiPaket? = null
)