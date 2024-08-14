package August_Practice.BitManipulation;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a=5;
        int b=7;
         a=a^b;
         b=b^a;
         a=a^b;

        System.out.println("After swaping two number"+a+ "  Or second number"+b);
    }
}
