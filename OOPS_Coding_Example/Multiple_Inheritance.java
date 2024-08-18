//package OOPS_Coding_Example;
//
// class  Animal{
//
//     int weight;
//     int age;
//     String color;
//
//     public Animal(int weight, int age, String color) {
//         this.weight = weight;
//         this.age = age;
//         this.color = color;
//     }
//
//     void sound(){
//         System.out.println("They will make a sound");
//     }
// }
//
// class  Dog extends  Animal{
//     String breed;
//     String name;
//     String size;
//
//     public Dog(int weight, int age, String color, String breed, String name, String size) {
//         super(weight, age, color);
//         this.breed = breed;
//         this.name = name;
//         this.size = size;
//     }
// }
// class  Puppy extends Dog{
//     String isVaccinated;
//     String tranninglavel;
//
//     public Puppy(int weight, int age, String color, String breed, String name, String size, String isVaccinated, String tranninglavel) {
//         super(weight, age, color, breed, name, size);
//         this.isVaccinated = isVaccinated;
//         this.tranninglavel = tranninglavel;
//     }
//
//
//     @Override
//     public String toString() {
//         return "Puppy{" +
//                 "isVaccinated='" + isVaccinated + '\'' +
//                 ", tranninglavel='" + tranninglavel + '\'' +
//                 ", breed='" + breed + '\'' +
//                 ", name='" + name + '\'' +
//                 ", size='" + size + '\'' +
//                 ", weight=" + weight +
//                 ", age=" + age +
//                 ", color='" + color + '\'' +
//                 '}';
//     }
// }
//
//
//public class Multiple_Inheritance {
//    public static void main(String[] args) {
//
//        Puppy P5=new Puppy(15,6,"Black","German Shepherd","Dhruv Rathi","Medium Size","Yes Vaccinated","HardCore");
//
//        System.out.println(P5);
//    }
//}
