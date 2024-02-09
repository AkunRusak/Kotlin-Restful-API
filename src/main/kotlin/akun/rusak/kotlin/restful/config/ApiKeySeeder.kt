package akun.rusak.kotlin.restful.config

import akun.rusak.kotlin.restful.entity.ApiKey
import akun.rusak.kotlin.restful.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeySeeder(val apiKeyRepository: ApiKeyRepository): ApplicationRunner {
    val apikey = "SECRET"

    override fun run(args: ApplicationArguments?) {
        if (!apiKeyRepository.existsById(apikey)){
            val entity = ApiKey(id = apikey)
            apiKeyRepository.save(entity)
        }
    }
}