package com.uriel.anahi.proyectospotifyyt.data.remote

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.uriel.anahi.proyectospotifyyt.data.entities.Song
import com.uriel.anahi.proyectospotifyyt.other.Constants.SONG_COLLECTION
import kotlinx.coroutines.tasks.await

//obtenemos la instancia de Firebase de nuestro google-services.json
//y se define un metodo para obtener todas las canciones de la base de datos, como una Lista de tipo Song
class MusicDatabase {

    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)

    suspend fun getAllSongs(): List<Song> {
        return try {
            songCollection.get().await().toObjects(Song::class.java)
        } catch(e: Exception) {
            emptyList()
        }
    }
}