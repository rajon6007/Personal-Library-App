package com.mrpaul.personallibraryapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class Book(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val author: String,
    val pages: Int,
    val isRead: Boolean = false
)
