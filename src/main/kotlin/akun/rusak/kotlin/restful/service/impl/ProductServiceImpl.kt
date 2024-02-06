package akun.rusak.kotlin.restful.service.impl

import akun.rusak.kotlin.restful.entity.Product
import akun.rusak.kotlin.restful.model.CreateProductRequest
import akun.rusak.kotlin.restful.model.ProductResponse
import akun.rusak.kotlin.restful.repository.ProductRepository
import akun.rusak.kotlin.restful.service.ProductService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(val productRepository: ProductRepository): ProductService {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        val product = Product(
            id = createProductRequest.id,
            name = createProductRequest.name,
            price = createProductRequest.price,
            quantity = createProductRequest.quantity,
            createdAT = Date(),
            updatedAT = null
        )
        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAT = product.createdAT,
            updatedAT = product.updatedAT
        )
    }
}