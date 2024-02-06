package akun.rusak.kotlin.restful.model

import java.util.*

data class ProductResponse (
    val id: String,

    val name: String,

    val price: Long,

    val quantity: Int,

    val createdAT: Date,

    val updatedAT: Date?
)