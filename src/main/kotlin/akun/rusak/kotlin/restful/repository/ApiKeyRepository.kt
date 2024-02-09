package akun.rusak.kotlin.restful.repository

import akun.rusak.kotlin.restful.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository: JpaRepository<ApiKey, String> {
}