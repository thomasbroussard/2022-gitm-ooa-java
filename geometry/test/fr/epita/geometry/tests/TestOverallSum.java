package fr.epita.geometry.tests;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Shape;
import fr.epita.geometry.datamodel.Triangle;

import java.util.Arrays;
import java.util.List;

public class TestOverallSum {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(5, 10, 10, 15);
        Triangle t2 = new Triangle(5, 15, 15, 20);
        Triangle t3 = new Triangle(10, 10, 5, 15);

        List<Triangle> triangles = Arrays.asList(t1, t2, t3);
        //how to make the sum of all the area taken by those triangles?
        double sum = 0.0;
        //or simple for loop
        for (int i = 0; i < triangles.size(); i++) {
            sum += triangles.get(i).getArea();
        }
        //or for each loop
        for (Triangle shape : triangles) {
            sum += shape.getArea();
        }

        System.out.println("total area for triangles" + sum);

        Circle c1 = new Circle(7);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(10);

        List<Circle> circles = Arrays.asList(c1, c2, c3);
        //global area for circles

        for (Circle shape : circles) {
            sum += shape.getArea();
        }


        List<Shape> shapes = Arrays.asList(c1, c2, c3, t1, t2, t3);

        for(Shape shape : shapes){
            sum += shape.getArea();
        }

    }

}
