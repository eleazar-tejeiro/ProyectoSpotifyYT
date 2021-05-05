package com.uriel.anahi.proyectospotifyyt.data.remote

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.uriel.anahi.proyectospotifyyt.data.entities.Song
import com.uriel.anahi.proyectospotifyyt.other.Constants.SONG_COLLECTION
import kotlinx.coroutines.tasks.await

//obtenemos la instancia de Firebase de nuestro google-services.json
//y se define un metodo para obtener todas las canciones de la base de datos, como una Lista de tipo Song
class MusicDatabase {
    //instanciamos enla varialbe firestore la instancia de nuestra base de datos
    //de Firebase para poder acceder a ella
    private val firestore = FirebaseFirestore.getInstance()
    // instanciamos la coleccion de canciones que tenemos en nuestra BD
    // en firebase le asignamos el nombre de SONGS, y eso lo declaramos
    // en nuestra constante SONG_COLLECTION
    private val songCollection = firestore.collection(SONG_COLLECTION)

    //Obtenemos todas las canciones de nuestra BD y la convertimos a objetos de tipo
    // SONG
    suspend fun getAllSongs(): List<Song> {
        return try {
            //corutina con await, espera el resultado sin bloquear el hilo, es decir
            // permite la ejecución hasta que obtenga una respuesta
            //esta en try y catch porque en caso de no tener respuesta ocurre una excepcion
            songCollection.get().await().toObjects(Song::class.java)
        } catch(e: Exception) {
            emptyList()
        }
    }
}