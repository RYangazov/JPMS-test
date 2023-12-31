package org.jetbrains.letsPlot.kotlin.modules.app

import org.jetbrains.letsPlot.kotlin.modules.lib.inf.Shape
import org.jetbrains.letsPlot.kotlin.modules.lib.inf.getShape
import org.jetbrains.letsPlot.kotlin.modules.lib.utils.rotateShape

fun main() {

    // Circle and Square should be found, but Rectangle should not be found
    listOf("Circle", "Square", "Rectangle")
            .forEach { shapeName ->
                val shape: Shape? = getShape(shapeName)
                if (shape != null) {
                    println("Found ${shape.getName()}.")
                } else {
                    println("$shapeName implementation of Shape not found.")
                }
            }

    // This should fail at compile-time.
    // Circle should be runtime-only.
    // val shape: Shape = Circle()

    val shape: Shape = getShape("Rectangle")!!
    println(shape.getName())

    rotateShape(shape)
}