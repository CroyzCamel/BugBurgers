package com.example.bugbusters.data

interface SendMessageRepository {
    suspend fun sendMessage(message: String):Boolean
}