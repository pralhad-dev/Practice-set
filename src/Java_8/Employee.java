package Java_8;

public class Employee {

    String name;
    Integer salary;

    Employee(String empName , Integer s) {
        name =empName;
        salary =s;
    }

    public String toString(){
        return name + "-"+salary;
    }

}

