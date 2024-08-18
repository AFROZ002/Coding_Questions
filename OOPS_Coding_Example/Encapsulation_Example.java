package OOPS_Coding_Example;


class  Student{
    private  String name;
    private  int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if(age>0){
           this.age = age;
       }
       else{
           System.out.println("Enter the Valid age");
       }
    }
    public  void Display(){
        System.out.println("Student name"+name);
        System.out.println("Student Age"+age);
    }
}

public class Encapsulation_Example {
    public static void main(String[] args) {

        Student st1=new Student("Afroz",22);
        st1.Display();
//        st1.getName();
//        st1.getAge();
        st1.setName("Alam");
        st1.setAge(23);

        System.out.println("\nUpdated Student Details:");
//        st1.display();

    }
}
