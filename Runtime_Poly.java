class A{
    public void show(){
        System.out.println("in class A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in class B");
    }
}
public class Runtime_Poly {
    public static void main(String args[]){
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
    }
    
}
