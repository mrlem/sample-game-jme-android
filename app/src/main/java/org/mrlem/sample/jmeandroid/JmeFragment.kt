package org.mrlem.sample.jmeandroid

import com.jme3.app.AndroidHarnessFragment
import org.mrlem.sample.jmeandroid.core.MyGame
import java.util.logging.Level
import java.util.logging.LogManager

/**
 * A placeholder fragment containing a jME GLSurfaceView.
 */
class JmeFragment : AndroidHarnessFragment() {
    init {
        eglBitsPerPixel = 24
        eglAlphaBits = 0
        eglDepthBits = 16
        eglSamples = 0
        eglStencilBits = 0
        frameRate = -1
        maxResolutionDimension = -1
        finishOnAppStop = true
        handleExitHook = true
        exitDialogTitle = "Do you want to exit?"
        exitDialogMessage =
            "Use your home key to bring this app into the background or exit to terminate it."
        splashPicID = 0
        appClass = MyGame::class.java.name

        LogManager.getLogManager().getLogger("").level = Level.INFO
    }

}