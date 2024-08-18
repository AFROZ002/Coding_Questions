package Lambda_Expression;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("My System Starts Here ");

//        MyInter MI=new MyInterImpl();
//        MI.sayHello();
//        MyInter i=new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("This is first anonymous class");
//            }
//        };
//        i.sayHello();
//
//        MyInter i2=new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("This is anoynmous class 2");
//            }
//        };
//        i2.sayHello();


//        MyInter i2=()->{
//            System.out.println("This is First time  iam using a Lembda Expression");
//        };
//        i2.sayHello();

//   SumInter SI=(int a, int b)->{
//       return a+b;
//   };
//        System.out.println(SI.sum(2,6));

LengthIntyer L1=(str -> str.length());

        System.out.println(L1.getLength("Afroz Alam"));

    }
}
