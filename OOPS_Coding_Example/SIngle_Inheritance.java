//// Base class
//class Animal {
//    // Method that will be overridden
//    void sound() {
//        System.out.println("Animal makes a sound.");
//    }
//    void sound(int a) {
//        System.out.println("Animal makes a sound."+a);
//    }
//}
//
//// Derived class
//class Dog extends Animal {
//    // Overriding the sound() method in Dog class
//    @Override
//    void sound() {
//        System.out.println("Dog barks.");
//    }
//}
//
//// Derived class
//class Cat extends Animal {
//    // Overriding the sound() method in Cat class
//    @Override
//    void sound() {
//        System.out.println("Cat meows.");
//    }
//}
//
//public class SIngle_Inheritance {
//    public static void main(String[] args) {
//        // Reference of type Animal
//        Dog myAnimal;
//
//        // Object of type Dog
//        myAnimal = new Dog();
//        myAnimal.sound(1);  // Output: Dog barks.
//
//        // Object of type Cat
////        myAnimal = new Cat();
////        myAnimal.sound();  // Output: Cat meows.
////
////        // Object of type Animal
////        myAnimal = new Animal();
////        myAnimal.sound();  // Output: Animal makes a sound.
//    }
//}
