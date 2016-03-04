package goit.gojava2.javacore.module4.figures;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int lenght, int width) {
        this.length = lenght;
        this.width = width;
    }

    @Override
    public double areaFigure() {
        return length *width;
    }
}
