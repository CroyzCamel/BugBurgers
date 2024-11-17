package com.example.bugbusters.data

import androidx.compose.animation.fadeIn
import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import kotlinx.coroutines.tasks.await

class SendMessageRepositoryImpl(private val db: FirebaseFirestore) : SendMessageRepository {

    override suspend fun sendMessage(message: String): Boolean {
        return try {
            val messageData = hashMapOf("message" to message)
            db.collection("user")
                .document()
                .collection("messages")
                .add(messageData)
                .await()
            true
        } catch (e: FirebaseFirestoreException) {
            println("Erro no Firebase: ${e.message}")
            false
        } catch (e: Exception) {
            println("Erro desconhecido: ${e.message}")
            false
        }
    }
}