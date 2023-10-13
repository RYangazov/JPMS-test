import org.jetbrains.letsPlot.kotlin.modules.lib.inf.Shape;

module org.jetbrains.letsPlot.kotlin.modules.app {
    requires kotlin.stdlib;
    requires org.jetbrains.letsPlot.kotlin.modules.shape;
    uses Shape;
}