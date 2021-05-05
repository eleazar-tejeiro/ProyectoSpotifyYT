package com.uriel.anahi.proyectospotifyyt.data.entities
/*
* A menudo se crean clases cuyo propósito principal es mantener los datos.
* En estas clases, algunas funcionalidades estándar y funciones de utilidad
* son a menudo mecánicamente derivables de los datos. En Kotlin, estas se
* llaman clases de datos y están marcadas con "data".
*/
//Se define el adaptador de los archivos como canciones, de este modo debe estar configurado en firebase
data class Song(
    val mediaId: String = "",
    val title: String = "",
    val subtitle: String = "",
    val songUrl: String = "",
    val imageUrl: String = ""
)