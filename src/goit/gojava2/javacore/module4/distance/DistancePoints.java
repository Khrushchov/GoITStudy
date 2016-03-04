package goit.gojava2.javacore.module4.distance;

import java.awt.*;

public class DistancePoints {
    public static void main(String[] args) {
        distance(2, 4, 6, 8);
    }

    public static double distance(int x1, int y1, int x2, int y2){
        Point firstPoint = new Point(x1, y1);
        Point secondPoint = new Point(x2, y2);
        System.out.println("Distance = " + firstPoint.distance(secondPoint));
        return firstPoint.distance(secondPoint);
    }
}
