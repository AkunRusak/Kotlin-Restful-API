package akun.rusak.kotlin.restful.service

import akun.rusak.kotlin.restful.model.CreateProductRequest
import akun.rusak.kotlin.restful.model.ProductResponse

interface ProductService {
    fun create(createProductRequest: CreateProductRequest): ProductResponse
}