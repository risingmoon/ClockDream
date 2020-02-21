package me.risingmooon.clockdream

import android.service.dreams.DreamService

class ClockDreamService: DreamService() {

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        setFullscreen(true)
        setContentView(R.layout.activity_main)
    }
}