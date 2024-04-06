package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id: String, val firstName: String, val lastName: String)

val sample = Customer("1234", "leo", "rodriguez")
val customerStorage = listOf<Customer>(sample)
