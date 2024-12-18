
public class Employee_CompileTimePoly{
    String emp_name;
    int emp_id;

    Employee_CompileTimePoly(String name, int id){
        emp_name=name;
        emp_id=id;
    }


    public void printInfo(String name){
        System.out.println("Employee Name is :"+name);
    }

    public void printInfo(int id){
        System.out.println("Employee ID is :"+id);
    }

    public void printInfo(String name,int id) {
       System.out.println("Name is :"+name+" Id is :"+id);
        
    }

    
    public static void main(String[] args) {
        Employee_CompileTimePoly e1 = new Employee_CompileTimePoly("Ankur ", 1001);
        e1.printInfo(e1.emp_id);
        e1.printInfo(e1.emp_name,e1.emp_id);
        e1.printInfo(e1.emp_name);
}
}