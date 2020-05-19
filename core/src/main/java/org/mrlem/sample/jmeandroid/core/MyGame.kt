package org.mrlem.sample.jmeandroid.core

import com.jme3.app.SimpleApplication
import com.jme3.material.Material
import com.jme3.scene.Geometry
import com.jme3.scene.shape.Box

/**
 * Basic game class.
 */
class MyGame : SimpleApplication() {

    override fun simpleInitApp() {
        val mat = Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md").apply {
            setTexture("ColorMap", getAssetManager().loadTexture("textures/crate.png"))
        }

        val geom = Geometry("Box", Box(1f, 1f, 1f)).apply {
            material = mat
        }

        rootNode.attachChild(geom)
    }

}
