package com.example.demo.item.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Item(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private val id: Long = 0,
           private val name: String,
           private val amount: Int) {
    fun getName(): String {
        return name
    }

    fun getAmount(): Int {
        return amount
    }
}