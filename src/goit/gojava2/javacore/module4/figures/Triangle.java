package goit.gojava2.javacore.module4.figures;
//GOTO
public class Triangle extends Figure {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double areaFigure() {
        return base*height*0.5;
    }
}
