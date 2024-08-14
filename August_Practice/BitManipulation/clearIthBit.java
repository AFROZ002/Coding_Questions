package August_Practice.BitManipulation;

public class clearIthBit {
    public static void main(String[] args) {
        int n=0b100111101;
        int i=4;

        int mask=~(1<<i);
        int result=mask&n;
        System.out.println(Integer.toBinaryString(result));

        System.out.println(result);
//        if(mask!=0){
//            System.out.println("1");
//
//        }
//        else {
//            System.out.println("0");
//        }
    }
}
