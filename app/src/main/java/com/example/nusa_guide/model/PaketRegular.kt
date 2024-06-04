package com.example.nusa_guide.model

data class PaketRegular(
    val id: Int,
    val nama: String,
    val gambar: Int,
    val harga: Int,
    val hariBerlibur: String,
    val jarak: Double,
    val deskripsi: String,
    val cuplikanPhotos: List<Int>,
    val informasiTourGuide: String,
    val informasiHarga: String,
    val ratingReview: Double,
    val ulasan: List<Ulasan>,
    val informasiPaket: InformasiPaket
)