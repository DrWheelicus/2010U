public class Rectangle extends Shape {

    public float length;
    public float width;

    public Rectangle(String colour, float length, float width) {
        super(colour);
        this.length = length;
        this.width = width;
    }

    public float getArea() {
        return this.length * this.width;
    }
    
    public float getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public String toString() {
        return this.colour + " rectangle with length " + Float.toString(this.length) + " and width " + Float.toString(this.width);
    }

}