import java.lang.Math.*;

public class Circle extends Shape {

    public float radius;

    public Circle(String colour, float radius) {
        super(colour);
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI) * this.radius * this.radius;
    }
    
    public float getPerimeter() {
        return (float) (2 * Math.PI * this.radius);
    }

    public String toString() {
        return this.colour + " circle with radius " + Float.toString(this.radius);
    }

}