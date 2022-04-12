package Day_38_InheritanceContinueTwo.Shapes;

public class Circle extends Shape{

    private double radius;
    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Invalid radius: "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi + '\'' +
                ", area=" + area() + '\'' +
                ", perimeter=" + perimeter() + '\'' +
                '}';
            }




/*
    @Override
    public double area(){
        int r = 0;
        double pi = 3.14;
        double area;

        area= pi*r*r;

    }

    public double perimeter (){
        int r = 0;
        double pi = 3.14;
        double perimeter;

        perimeter=2*r*pi;

    }*/



}
