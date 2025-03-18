public class EmployeeDetails {
    String name;
    int id;
    int salary;

    EmployeeDetails(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    public static void main(String[] args){
        EmployeeDetails obj=new EmployeeDetails("Ayush",21,25000);
        obj.display();

    }
}
