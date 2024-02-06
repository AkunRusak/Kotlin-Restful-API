package akun.rusak.kotlin.restful.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "products")
data class Product (
    @Id
    val id: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "price")
    val price: Long,

    @Column(name = "quantity")
    val quantity: Int,

    @Column(name = "created_at")
    val createdAT: Date,

    @Column(name = "updated_at")
    val updatedAT: Date?

    )