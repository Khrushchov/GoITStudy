package goit.gojava2.javacore.module4.figures;
import static java.lang.Math.*;

class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double areaFigure() {
        return PI*pow(radius, 2);
    }
}
