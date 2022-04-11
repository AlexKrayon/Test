package Day_38_InheritanceContinueTwo.Shapes;

public class Shape {

    public String name;
    public int area;
    public int perimeter;

    public Shape(String name, int area, int perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void area(){

    }

    public void perimeter (){

    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
