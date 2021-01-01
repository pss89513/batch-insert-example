package com.example.demo.item

import com.example.demo.item.domain.Item
import com.example.demo.item.domain.ItemRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.system.measureTimeMillis

@SpringBootTest
class BatchInsertTest {
    @Autowired
    private lateinit var itemRepository: ItemRepository

    @Test
    fun `testing saveAll`() {
        val items = (1..1000).map { Item(name = "피자", amount = 10000) }
        val measureTimeMillis = measureTimeMillis{ itemRepository.saveAll(items) }
        println("실행시간 $measureTimeMillis")
    }

    @Test
    fun `testing batchInsert`() {
        val items = (1..1000).map { Item(name = "피자", amount = 10000) }
        val measureTimeMillis = measureTimeMillis { itemRepository.batchInsert(items) }
        println("실행시간 $measureTimeMillis")
    }
}