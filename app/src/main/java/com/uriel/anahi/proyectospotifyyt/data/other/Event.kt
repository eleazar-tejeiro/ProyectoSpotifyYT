package com.uriel.anahi.proyectospotifyyt.data.other

//permite que una vez se ejecuta por primera vez la variable booelana no pueda cambiar
//nuevamente al establezerla como private set
open class Event<out T>(private val data: T) {
    var hasBeenHandled = false
        private set

    fun getContentUfNotHandled(): T?{
        return  if (hasBeenHandled){
            null
        }else{
            hasBeenHandled = true
            data
        }
    }
    fun peekContent() = data
}