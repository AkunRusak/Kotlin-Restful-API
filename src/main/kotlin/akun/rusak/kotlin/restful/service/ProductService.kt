package akun.rusak.kotlin.restful.service

import akun.rusak.kotlin.restful.model.CreateProductRequest
import akun.rusak.kotlin.restful.model.ListProductRequest
import akun.rusak.kotlin.restful.model.ProductResponse
import akun.rusak.kotlin.restful.model.UpdateProductRequest

interface ProductService {
    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>
}