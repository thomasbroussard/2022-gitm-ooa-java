package fr.epita.geometry.tests;

import fr.epita.geometry.datamodel.*;

import java.util.Arrays;
import java.util.List;

public class TestOverallSum {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(5, 10, 10, 15);
        Triangle t2 = new Triangle(5, 15, 15, 20);
        Triangle t3 = new Triangle(10, 10, 5, 15);
        Circle c1 = new Circle(7);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(10);
        Rectangle r1 = new Rectangle(7, 5);
        Rectangle r2 = new Rectangle(5, 10);
        Rectangle r3 = new Rectangle(10, 5);
        Square s1 = new Square(7);
        Square s2 = new Square(5);
        Square s3 = new Square(10);

        Double sum = 0.0;
        Double perimeter = 0.0;

        List<Shape> shapes = Arrays.asList(c1, c2, c3,
                t1, t2, t3,
                r1, r2, r3,
                s1, s2, s3
        );

        for(Shape shape : shapes){
            sum += shape.getArea();
            perimeter += shape.getPerimeter();
        }
        System.out.println(sum);
        System.out.println(perimeter);

    }

}
