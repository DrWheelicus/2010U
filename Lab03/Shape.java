import java.util.*;

public abstract class Shape {

    public String colour;

    public Shape(String colour){
        this.colour = colour;
    }

    public abstract float getArea();
    public abstract float getPerimeter();
    public abstract String toString();

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Red", 2.0f));
        shapes.add(new Rectangle("Blue", 1.5f, 3.0f));

        for (Shape shape: shapes) {
            System.out.println("");
            System.out.println(shape.toString());
            System.out.printf("Area: %.2f\n", shape.getArea());
            System.out.printf("Perimeter: %.2f\n", shape.getPerimeter());
        }
       }
       
}