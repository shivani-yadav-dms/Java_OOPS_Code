abstract class Project{
    int p_id;
    String p_name;
    abstract void status();

}

class Evergren extends Project{
    public void status(){
        System.out.println("Going on");
    }
}
public class abstraction {
    public static void main(String args[]){
    Evergren eg = new Evergren();
    eg.p_id=10;
    eg.p_name="Evergren";
    System.out.println("Project name is :"+eg.p_id+"\n Project id is :"+eg.p_id);
    eg.status();
}
}
