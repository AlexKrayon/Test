package Day_38_InheritanceContinueTwo.Shapes;

public class Shape {
/*
    public String name;
    public int area;
    public int perimeter;

    public Shape(String name, int area, int perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    } */

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name can not be null.");
            System.exit(0);
        }
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(0);
        }
        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }
    /*public double area(){
        return 0;
    }*/



    public double area(){
        return 0;
    }

    public double perimeter (){
    return 0;
    }
/*
    @Override
    public String toString() {
        return super.toString();
    }*/


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area() + '\'' +
                ", perimeter=" + perimeter() + '\'' +
                '}';
    }
}
