package org.jetbrains.letsPlot.kotlin.modules.lib.impl

import org.jetbrains.letsPlot.kotlin.modules.lib.inf.Shape

class Circle : Shape {
    override fun getName(): String = "Circle"
}

class Square : Shape {
    override fun getName(): String = "Square"
}

class Rectangle : Shape {
    override fun getName(): String = "Rectangle"
}