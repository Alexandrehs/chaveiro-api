package com.chaveiro.chaveiroapi.entity

import com.chaveiro.chaveiroapi.rest.ItemRequest
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity()
@Table(name = "items")
data class ItemEntity (
    @Id
    val id: String,
    @Column(name ="name")
    val name: String,
    @Column(name ="brand")
    val brand: String,
    @Column(name ="price")
    val price: Long,
    @Column(name ="storage")
    val storage: Long,
    @Column(name ="minimum")
    val minimum: Long
) {
    constructor(itemRequest: ItemRequest) : this (
        id = UUID.randomUUID().toString(),
        name = itemRequest.name!!,
        brand = itemRequest.brand!!,
        price = (itemRequest.price!!).toLong(),
        storage = (itemRequest.storage!!).toLong(),
        minimum = (itemRequest.minimum!!).toLong()
    )
}