class Project{
    public String name;
    int id;  //default
    private int budget;


public void setBudget(int new_budget){
    this.budget=new_budget;
}

public int getBudget(){
    return this.budget;
}
}
public class Encapsulation {
    public static void main(String args[]){
        Project p = new Project();
        p.name="DMS Project";// Accessible because its public
        p.id = 2521; //Accessible because used in same package
        // p.budget = 10000 Will give error as it is private. So to use we can use getter and setter

        int budget = p.getBudget();
        System.out.println(budget);
        p.setBudget(900);
        int new_budget=p.getBudget();
        System.out.println(new_budget);
    }
}
