import org.jetbrains.letsPlot.kotlin.modules.lib.impl.Circle;
import org.jetbrains.letsPlot.kotlin.modules.lib.impl.Square;
import org.jetbrains.letsPlot.kotlin.modules.lib.inf.Shape;

module org.jetbrains.letsPlot.kotlin.modules.shape {
    requires kotlin.stdlib;
    exports org.jetbrains.letsPlot.kotlin.modules.lib.inf;
    //exports org.jetbrains.letsPlot.kotlin.modules.lib.utils;
    exports org.jetbrains.letsPlot.kotlin.modules.lib.utils;
    uses Shape;
    provides Shape with
            Circle,
            Square;
}