package goit.gojava2.javacore.module4.figures;

public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(8, 10);
        Figure circle = new Circle(10);
        Figure triangle = new Triangle(10, 8);

        System.out.println("Area of rectangle = " + rectangle.areaFigure());
        System.out.println("Area of circle = " + circle.areaFigure());
        System.out.println("Area of triangle = " + triangle.areaFigure());
    }
}
