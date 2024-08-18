//package OOPS_Coding_Example;
//
//interface  Engine{
//   void start();
//}
//interface  Vehicle{
//
//    void drive();
//
//}
//class  Car implements  Engine,Vehicle{
//    @Override
//    public void start() {
//        System.out.println("Car engine Started");
//    }
//
//    @Override
//    public void drive() {
//        System.out.println("  Car chala rha hu m ");
//    }
//
//    void fuel(){
//        System.out.println("Oil dalwa rha hu m ABhi ");
//    }
//
//}
//class  ElectricCar  extends  Car{
//    @Override
//    public void start() {
////        super.start();
//        System.out.println("Electric car started silently");
//    }
//
//    void ChargeBattery(){
//        System.out.println("Electric car  charging right now ");
//    }
//
//}
//
//
//public class Diamond_Interface {
//    public static void main(String[] args) {
//
//        ElectricCar E5=new ElectricCar();
////        E5.ChargeBattery();
////        E5.start();
////        E5.drive();
////        E5.fuel();
//
//
////         Car C5=new Car();
////        C5.ChargeBattery();
////        C5.start();
////        C5.drive();
////        C5.fuel();
//
//        // Using methods from interfaces
//        Engine engine = E5;
//        Vehicle vehicle = E5;
//
//        engine.start();  // Output: Electric Car engine started silently.
//        vehicle.drive(); // Output: Car is driving.
//
//
//
//
//
//
//
//    }
//}
