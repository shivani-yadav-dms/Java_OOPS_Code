 interface Animal{
    void walk();
}

class Dog implements Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
public class Interfaces_Example {
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.walk();
    }
}
