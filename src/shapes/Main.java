package shapes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle("FirstTriangle", "Metal", 30, 40);
        Triangle triangle2 = new Triangle(75, 100);
        Rectangle rectangle1 = new Rectangle("FirstRectangle", "Steel", 60, 75);
        Rectangle rectangle2 = new Rectangle(45, 80);

        System.out.println(triangle1.getSize());
        System.out.println(triangle2.getSize());
        System.out.println(triangle1);
        System.out.println(triangle2);
        triangle1.displayTriangleHeight();
        triangle2.displayTriangleHeight();
        System.out.println(triangle1.hashCode());
        System.out.println(triangle2.hashCode());

        System.out.println(rectangle1.getSize());
        System.out.println(rectangle2.getSize());
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        rectangle1.displayRectangleHeight();
        rectangle2.displayRectangleHeight();
        System.out.println(rectangle2.equals(triangle1));
        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());


        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);

        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println(s.getSize());
        }

        for (Shape s : shapes) {
            if (s instanceof Triangle) {
                Triangle triangle = (Triangle) s;
                triangle.displayTriangleHeight();
            } else if (s instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) s;
                rectangle.displayRectangleHeight();
            }
        }
    }
}
