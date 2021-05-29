package com.chaveiro.chaveiroapi.rest

import com.chaveiro.chaveiroapi.entity.ItemEntity
import com.chaveiro.chaveiroapi.repository.ItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/items")
class ItemResource {
    @Autowired
    lateinit var repository : ItemRepository

    @PostMapping
    fun create(@RequestBody itemRequest: ItemRequest) : ResponseEntity<ItemResponse> {
        val itemEntity = repository.save(ItemEntity(itemRequest))
        val itemResponse = ItemResponse(itemEntity.id)
        return ResponseEntity.status(HttpStatus.CREATED).body(itemResponse)
    }
}