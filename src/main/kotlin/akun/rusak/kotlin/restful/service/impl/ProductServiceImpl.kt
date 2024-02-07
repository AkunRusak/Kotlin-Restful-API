package akun.rusak.kotlin.restful.service.impl

import akun.rusak.kotlin.restful.entity.Product
import akun.rusak.kotlin.restful.error.NotFoundException
import akun.rusak.kotlin.restful.model.CreateProductRequest
import akun.rusak.kotlin.restful.model.ProductResponse
import akun.rusak.kotlin.restful.repository.ProductRepository
import akun.rusak.kotlin.restful.service.ProductService
import akun.rusak.kotlin.restful.validation.ValidationUtil
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(
    val productRepository: ProductRepository,
    val validationUtil: ValidationUtil
): ProductService {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        validationUtil.validate(createProductRequest)

        val product = Product(
            id = createProductRequest.id!!,
            name = createProductRequest.name!!,
            price = createProductRequest.price!!,
            quantity = createProductRequest.quantity!!,
            createdAT = Date(),
            updatedAT = null
        )
        productRepository.save(product)

        return convertProductToProductResponse(product)
    }

    override fun get(id: String): ProductResponse {
        val product = productRepository.findByIdOrNull(id)
        if (product == null){
            throw NotFoundException()
        }else{
            return convertProductToProductResponse(product)
        }
    }
    private fun convertProductToProductResponse(product: Product): ProductResponse {
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