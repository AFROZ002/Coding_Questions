package August_Practice.BitManipulation;

public class ToggleIthBit {
    public static void main(String[] args) {
        int n=0b100000011;
        int i=1;
        int mask=1<<i;
        int res=mask^n;
        System.out.println(res);
        System.out.println(Integer.toBinaryString(res));
    }
}
