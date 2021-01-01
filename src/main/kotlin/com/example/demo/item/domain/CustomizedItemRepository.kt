package com.example.demo.item.domain


interface CustomizedItemRepository {
    fun batchInsert(items: List<Item>)
}
