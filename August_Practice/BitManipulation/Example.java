package August_Practice.BitManipulation;

public class Example {
    public static void main(String[] args) {
        int n=0b100111101;

        int i=4;
        int mask=(1<<i)&n;
//        int mask=(n>>i)&1;
        if(mask==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
//        System.out.println(mask);
    }
}
