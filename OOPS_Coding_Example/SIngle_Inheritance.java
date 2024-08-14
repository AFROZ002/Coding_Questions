package OOPS_Coding_Example;

class  Animal{

     String name;
     int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sleep(){
        System.out.println("Sleeping right now");
    }

    void sleep(String  name,int age){
        System.out.println(name+"dog is sleeping right now in parent class"+age);

    }
}
class Dog  extends  Animal{
    int DogId;

    public Dog(String n, int a, int dogId) {
        super(n, a);
        DogId = dogId;
    }

    @Override
    void sleep() {
        System.out.println(DogId+"dog is sleeping right now");
    }


    public  void printname(){
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "DogId=" + DogId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    void bark(){
        System.out.println("Dogs are barking right now");
    }
}
public class SIngle_Inheritance {
    public static void main(String[] args) {

        Animal D5=new Dog("max",12,8);
        System.out.println(D5);
        D5.printname();

        D5.bark();
        D5.sleep();
        D5.sleep("Buzo",19);




    }
}
