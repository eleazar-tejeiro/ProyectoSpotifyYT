package com.uriel.anahi.proyectospotifyyt.data.entities

//Se define el adaptador de los archivos como canciones, de este modo debe estar configurado en firebase
data class Song(
    val mediaId: String = "",
    val title: String = "",
    val subtitle: String = "",
    val songUrl: String = "",
    val imageUrl: String = ""
)