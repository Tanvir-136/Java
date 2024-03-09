class Employee{
    int salary;
    Employee(int salary){
        this.salary = salary;
    }
    void work(){
        System.out.println("Working as an employee");
    }
    int getSalary(){
        return salary;
    }
}
class HRmanager extends Employee{
    HRmanager(int salary){
        super(salary);
    }
    void work(){
        System.out.println("\nManaging employees");
    }
    void addEmployee(){
        System.out.println("Adding new employee");
    }
} 

public class exm4 {
    public static void main(String[] args) {
        Employee obj_em = new Employee(30000);
        HRmanager obj_man =  new HRmanager(40000);
        obj_em.work();
        System.out.println("Employee salary: " + obj_em.getSalary());
        obj_man.work();
        System.out.println("Manager Salary: "+obj_man.getSalary());
        obj_man.addEmployee();
    }
}