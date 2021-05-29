package com.chaveiro.chaveiroapi.repository

import com.chaveiro.chaveiroapi.entity.ItemEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository : JpaRepository<ItemEntity, String> {
}