package Day_38_InheritanceContinueTwo.Shapes;

public class Circle extends Shape {


    public Circle(int area, int perimeter) {
        super("Circle", area, perimeter);
    }



    @Override
    public void area(){
        int r = 0;
        double pi = 3.14;
        double area;

        area= pi*r*r;

    }

    public void perimeter (){
        int r = 0;
        double pi = 3.14;
        double perimeter;

        perimeter=2*r*pi;

    }



}
