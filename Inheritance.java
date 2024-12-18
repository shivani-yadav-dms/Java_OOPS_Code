class Shape{
    String color;
    public void area(){
        System.out.println("Displays area in Shape");
    }
}

class Triangle extends Shape{
    String name;

    public void printName(String name){
        System.out.println("Name is "+name);
    }
}

public class Inheritance {

    public static void main(String args[]){
    Triangle tr = new Triangle();
    tr.name="Triangle";
    tr.area();
    tr.printName(tr.name);
    }
}
