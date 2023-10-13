package org.jetbrains.letsPlot.kotlin.modules.app

import org.jetbrains.letsPlot.kotlin.modules.lib.inf.Shape
import org.jetbrains.letsPlot.kotlin.modules.lib.inf.getShape
import org.jetbrains.letsPlot.kotlin.modules.lib.utils.rotateShape

fun main() {

    listOf("Circle", "Square", "Rectangle")
            .forEach { shapeName ->
                val shape: Shape? = getShape(shapeName)
                if (shape != null) {
                    println("Found ${shape.getName()}.")
                } else {
                    println("$shapeName implementation of Shape not found.")
                }
            }

    val shape: Shape = getShape("Rectangle")!!
    println(shape.getName())

    rotateShape(shape)
}