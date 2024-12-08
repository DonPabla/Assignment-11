package shapes3d;

import java.util.Random;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Shape3DInterface[] shapes = new Shape3DInterface[10];

        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0 -> {
                    double radius = 1 + random.nextDouble() * 9; // Random radius between 1 and 10
                    shapes[i] = new Sphere(radius);
                }
                case 1 -> {
                    double radius = 1 + random.nextDouble() * 9; // Random radius between 1 and 10
                    double height = 5 + random.nextDouble() * 15; // Random height between 5 and 20
                    shapes[i] = new Cylinder(radius, height);
                }
                case 2 -> {
                    double side = 1 + random.nextDouble() * 9; // Random side length between 1 and 10
                    shapes[i] = new Cube(side);
                }
            }
        }

        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n", shape.volume());
            System.out.println();
        }
    }
}
