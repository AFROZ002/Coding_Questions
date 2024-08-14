package OOPS_Coding_Example;

class  Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
class  Employee extends  Person {

    int employeeId;

    public Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

}


public class Multiple_Inheritance {
    public static void main(String[] args) {



    }
}
