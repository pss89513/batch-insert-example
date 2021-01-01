package com.example.demo.item.domain

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component

@Component
class CustomizedItemRepositoryImpl(private val jdbcTemplate: JdbcTemplate) : CustomizedItemRepository {
    override fun batchInsert(items: List<Item>) {
        jdbcTemplate.batchUpdate(
            "insert into item (name, amount) values (?, ?)", items, 100
        ) { ps, argument ->
            ps.setString(1, argument.getName())
            ps.setInt(2, argument.getAmount())
        }
    }
}