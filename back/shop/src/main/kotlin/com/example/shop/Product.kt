package com.example.shop

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Product(
    @Id @GeneratedValue
    var id: Long? = null,
    var price: Float? = null,
    var name: String? = null,
    var description: String? = null
)

@RepositoryRestResource
interface ProductRepository: PagingAndSortingRepository<Product, Long>