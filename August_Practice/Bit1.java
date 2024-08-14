package August_Practice;

public class Bit1 {
    public  static  void swapwithout(int a, int b){

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a is equal to "+a);
        System.out.println("b is equal to "+b);



    }
    public static void main(String[] args) {

        int a=5;
        int b=7;
   swapwithout(a,b);



    }
}
