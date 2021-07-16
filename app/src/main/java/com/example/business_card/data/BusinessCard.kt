package com.example.business_card.data

import androidx.room.Entity
import androidx.room.PrimaryKey

//1
@Entity
data class BusinessCard(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nome: String,
    val empresa: String,
    val telefone: String,
    val email: String,
    val fundoPersonalizado: String
)