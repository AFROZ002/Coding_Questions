package August_Practice.BitManipulation;

public class RightMostSetBit {
    public static void main(String[] args) {
        int n=0b1000;

        int mask=1;
        int counter=1;

        while(n!=0){
            if((n&mask)!=0){
                System.out.println("Right most set is found  at postion  " +counter);
                return;
            }
            else{
                n=n>>1;
                counter=counter+1;
            }
        }

    }
}
