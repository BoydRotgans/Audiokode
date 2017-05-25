package org.jglrxavpok.audiokode

import org.lwjgl.openal.AL10.AL_NO_ERROR
import org.lwjgl.openal.AL10.alGetError
import org.lwjgl.openal.AL10



fun checkErrors(info: String = "") {
    val error = alGetError()
    if(error != AL_NO_ERROR)
        println("Error ${getALErrorString(error)} $info")
}

fun getALErrorString(err: Int): String {
    when (err) {
        AL10.AL_NO_ERROR -> return "AL_NO_ERROR"
        AL10.AL_INVALID_NAME -> return "AL_INVALID_NAME"
        AL10.AL_INVALID_ENUM -> return "AL_INVALID_ENUM"
        AL10.AL_INVALID_VALUE -> return "AL_INVALID_VALUE"
        AL10.AL_INVALID_OPERATION -> return "AL_INVALID_OPERATION"
        AL10.AL_OUT_OF_MEMORY -> return "AL_OUT_OF_MEMORY"
        else -> return "Unknown error code $err"
    }
}