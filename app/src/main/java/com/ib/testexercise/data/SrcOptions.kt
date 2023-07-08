package com.ib.testexercise.data

data class SrcOptions(
    val directory: String,
    val is_fanon: String,
    val is_mediawiki: String,
    val is_wikipedia: String,
    val language: String,
    val min_abstract_length: String,
    val skip_abstract: String,
    val skip_abstract_paren: String,
    val skip_end: String,
    val skip_icon: String,
    val skip_image_name: String,
    val skip_qr: String,
    val source_skip: String,
    val src_info: String
)