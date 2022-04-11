package Day_31_Constructors;

public class Rectangle {
    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calArea(){
        return length * width;
    }

    public double calPerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area= " + calArea() +
                ", Perimeter= " + calPerimeter() +
                '}';
    }


}
