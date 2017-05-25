package org.jglrxavpok.audiokode

import org.jglrxavpok.audiokode.decoders.WaveDecoder

class Buffer(val alID: Int, val engine: SoundEngine) {

    var data: ByteArray = byteArrayOf()
    var codec = WaveDecoder
    var frequency = 0
    var format = 0

    fun upload() {
        engine.upload(this, data)
    }
}