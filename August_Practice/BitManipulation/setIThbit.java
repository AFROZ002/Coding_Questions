package August_Practice.BitManipulation;

public class setIThbit {
    public static void main(String[] args) {
        int num=0b100001101;
        int i=5;
        int mask=1<<i;
        int res=num|mask;
        System.out.println(res);
        System.out.println("Binary: " + Integer.toBinaryString(res));

    }
}
