package com.chaveiro.chaveiroapi.rest

data class ItemRequest (
    val name: String?,
    val brand: String?,
    val price: Number?,
    val storage: Number?,
    val minimum: Number?
)

data class ItemResponse (
    val id: String?
) {
    constructor(itemResponse: ItemResponse) : this (
        id = itemResponse.id
    )
}