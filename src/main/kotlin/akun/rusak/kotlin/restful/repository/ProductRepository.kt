package akun.rusak.kotlin.restful.repository

import akun.rusak.kotlin.restful.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, String> {

}