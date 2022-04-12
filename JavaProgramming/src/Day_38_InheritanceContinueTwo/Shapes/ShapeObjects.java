package Day_38_InheritanceContinueTwo.Shapes;

public class ShapeObjects {
    public static void main(String[] args) {
        Square square = new Square(8);

        System.out.println(square);

        square.setSide(4);
        System.out.println(square);
        System.out.println(square.getName());

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        Rectangle rectangle = new Rectangle(12,4);
        System.out.println(rectangle);

        rectangle.setWidth(6);
        rectangle.setLength(12);
        System.out.println(rectangle);
        System.out.println(rectangle.getName());

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        Circle circle = new Circle(6);

        System.out.println(circle.getName());
        System.out.println(circle);







    }
}
