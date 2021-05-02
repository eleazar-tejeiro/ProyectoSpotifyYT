package com.uriel.anahi.proyectospotifyyt.data.other

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