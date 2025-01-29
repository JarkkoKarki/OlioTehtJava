package Polymorphism;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle(8.0, 3.0)
        };
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Area of Circle with radius " + circle.getRadius() + ": " + shape.calculateArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Area of Rectangle with width " + rectangle.getWidth() + " and height " + rectangle.getHeight() + ": "+  + shape.calculateArea());
            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                System.out.println("Area of Triangle with base "+ triangle.getBase() + " and height " + triangle.getHeight() + ": " + shape.calculateArea());
            }
        }
    }
}
