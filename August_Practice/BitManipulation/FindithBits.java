package August_Practice.BitManipulation;

public class FindithBits {
    public static void main(String[] args) {
        int n=0b100101101;
        int i=5;
        int p=(n>>i)&1;



        System.out.println(p);
    }
}

//////    How do you check if the ith bit of a number is set (1) or not (0)?
////public  static int setOrNot(int n, int i){
////    int mask=1<<i;
////    int res=mask&n;
////
////    System.out.println(res);
////    return  res;
//
////}
////int n=0b100101101;
////int i=5;
////
////int res1=setOrNot(n,i);
////        if (res1 != 0) {
////        System.out.println("The bit at position " + i + " is set.");
////        } else {
////                System.out.println("The bit at position " + i + " is not set.");
////        }